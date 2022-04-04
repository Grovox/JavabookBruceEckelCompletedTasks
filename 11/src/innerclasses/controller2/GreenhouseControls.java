package innerclasses.controller2;

public class GreenhouseControls extends Controller {
    private boolean light = false;
    public class LightOn extends Event {
        public LightOn(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
        light = true;
        }
        public String toString(){
            return "Свет включен";
        }
    }
    public class LightOff extends Event {
        public LightOff(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;
        }
        public String toString(){
            return "Свет выключен";
        }
    }

    private boolean water = false;
    public class WaterOn extends Event {

        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }

        public String toString(){
            return "Полив включен";
        }
    }
    public class WaterOff extends Event {

        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = false;
        }

        public String toString(){
            return "Полив выключен";
        }
    }

    private boolean Aeration = false;
    public class AerationOn extends Event {

        public AerationOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            Aeration = true;
        }

        public String toString(){
            return "Проветривение включен";
        }
    }
    public class AerationOff extends Event {

        public AerationOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            Aeration = false;
        }

        public String toString(){
            return "Проветривение выключен";
        }
    }

    private String thermostat = "День ";
    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Ночь";
        }

        public String toString(){
            return "Термостат использует ночной режим";
        }
    }

    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "День";
        }

        public String toString(){
            return "Термостат использует дневной режим";
        }
    }

    public class Bell extends Event {

        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        public String toString(){
            return "Бам!";
        }
    }
    public class Restart extends Event {
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList)
                addEvent(e);
        }

        @Override
        public void action() {
            for (Event e : eventList) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }
        public String toString(){
            return "Перезапуск системы";
        }
    }
    public static class Terminate extends Event {

        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }
        public String toString(){
            return "Отключение";
        }
    }
}
