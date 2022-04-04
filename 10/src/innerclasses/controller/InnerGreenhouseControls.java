package innerclasses.controller;

public class InnerGreenhouseControls extends GreenhouseControls{
    private boolean Wetting = false;
    public class WettingOn extends Event{

        public WettingOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            Wetting = true;
        }

        public String toString(){
            return "Увлажнение включен";
        }
    }
    public class WettingOff extends Event {

        public WettingOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            Wetting = false;
        }

        public String toString(){
            return "Увлажнение выключен";
        }
    }
}
