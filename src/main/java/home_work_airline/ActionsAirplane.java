package home_work_airline;

import java.util.*;

public class ActionsAirplane {
    public static double sumOfLoadCapacity(List<Plane> listAirplanes) {
        double price = 0;
        for (Plane airline : listAirplanes) {
            price += airline.getLoadCapacity();
        }
        return price;
    }

    public static double sumOfCapacity(List<Plane> listAirplanes) {
        double price = 0;
        for (Plane plane : listAirplanes) {
            price += plane.getCapacity();
        }
        return price;
    }

    public static List<Plane> sortByFuelCost(List<Plane> listAirplanes, double maxConsumedFuel, double minConsumedFuel) {
        List<Plane> sortByFuel = new ArrayList<>();
        for (Plane plane : listAirplanes) {
            if (plane.getConsumedFuel() >= minConsumedFuel && plane.getConsumedFuel() <= maxConsumedFuel) {
                sortByFuel.add(plane);
            }
        }
        return sortByFuel;
    }
}


