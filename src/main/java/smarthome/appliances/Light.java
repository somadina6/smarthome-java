package smarthome.appliances;

public class Light implements Appliance{
    private boolean isOn;

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Light turned off");
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Light turned on");
    }

    public boolean getStatus(){
        return isOn;
    }
}
