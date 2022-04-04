import innerclasses.controller.*;

public class TwentyTwo_TwentyTree {
    public static void main(String[] args) {
        /*GreenhouseControls gc = new GreenhouseControls();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new AerationOn(1000),
                gc.new AerationOff(1200),
                gc.new ThermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000,eventList));
        if (args.length == 1)
            gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
        gc.run();*/
        InnerGreenhouseControls gc = new InnerGreenhouseControls();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new AerationOn(1000),
                gc.new AerationOff(1200),
                gc.new WettingOn(1400),
                gc.new WettingOff(1600),
                gc.new ThermostatDay(1800)
        };
        gc.addEvent(gc.new Restart(2000,eventList));
        if (args.length == 1)
            gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
        gc.run();
    }
}
