package smarthome.controller;

import smarthome.appliances.Appliance;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class HomeController {
    private final List<Appliance> appliances;

    public HomeController() {
        appliances = new ArrayList<>();
    }

    public void addAppliance(Appliance appliance) {
        appliances.add(appliance);
    }

    public void turnOffAll() {
        for (Appliance appliance : appliances) {
            appliance.turnOff();
        }
        System.out.println("All appliances have been turned off.");
    }

    // Method to schedule yearly update
    public void scheduleYearlyUpdate() {
        try (ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1)) {

            // Calculate the delay for January 1st, 1:00 AM
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime nextYear = LocalDateTime.of(now.getYear() + 1, Month.JANUARY, 1, 1, 0);

            long delay = java.time.Duration.between(now, nextYear).getSeconds();

            scheduler.scheduleAtFixedRate(this::turnOffAll, delay, TimeUnit.DAYS.toSeconds(365), TimeUnit.SECONDS);
        }
        catch (Exception e) {
          System.out.println(e.toString());
        }
    }

}
