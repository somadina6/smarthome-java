package smarthome;

import smarthome.appliances.AirConditioner;
import smarthome.appliances.Appliance;
import smarthome.appliances.Fan;
import smarthome.appliances.Light;
import smarthome.controller.HomeController;

public class SmartHome {
    public static void main(String[] args) {
        // Initialize appliances
        Appliance light = new Light();
        Appliance fan = new Fan();
        Appliance airConditioner = new AirConditioner();

        // Initialize the home controller
        HomeController controller = new HomeController();
        controller.addAppliance(light);
        controller.addAppliance(fan);
        controller.addAppliance(airConditioner);

        // Example Usage
        light.turnOn();
        fan.turnOn();
        airConditioner.turnOn();

        // Schedule yearly update
        controller.scheduleYearlyUpdate();
    }
}
