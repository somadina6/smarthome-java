package smarthome.appliances;

public class Fan implements Appliance{
    private int speed; // 0=off, 1 = low, 2 = high

    @Override
    public void turnOn(){
        speed = 1; // Defaults to low
        System.out.println("Turning on fan");
    }

    @Override
    public void turnOff() {
        speed = 0;
        System.out.println("Turning off fan");
    }

    public void setSpeed(int speed) {
        if(speed > 2 || speed < 0){
            System.out.println("Speed must be between 0 and 2");
        }
        else {
            this.speed = speed;
        }
    }

    public int getSpeed(){
        return speed;
    }
}
