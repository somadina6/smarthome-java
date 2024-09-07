package smarthome.appliances;

public class AirConditioner implements Appliance {
    public enum Mode {
        COOL, HEAT, OFF
    }
    private Mode mode;

    @Override
    public void turnOn() {
        mode = Mode.COOL;
        System.out.println("Air conditioner turned on to COOL mode");
    }

    @Override
    public void turnOff() {
        mode = Mode.OFF;
        System.out.println("Air conditioner turned off to OFF mode");
    }

    public Mode getMode() {
        return mode;
    }

    public  void setMode(Mode mode) {
        this.mode = mode;
    }
}

