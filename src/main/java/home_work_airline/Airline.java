package home_work_airline;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static home_work_airline.ModelPlane.*;


import static home_work_airline.TypeOfPlane.*;

public class Airline {
    private static double MAX_CONSUMED_FUEL = 900;
    private static double MIN_CONSUMED_FUEL = 600;

    public static void main(String[] args) {
        List<Plane> listAirplanes = Arrays.asList(new Mig(WAR, 800.5, FIGHTER, 23432, 34234, 33343),
                new Boeing(PASSENGERS, 354.54, TY_143, 22345, 229453, 23254),
                new Airbus(CARGO, 212.5454, A_483, 21256, 264454, 56454));
        System.out.println("Print all planes");
        listAirplanes.forEach(System.out::println);

        System.out.println("Sort by range of flight ");
        Collections.sort(listAirplanes);
        listAirplanes.forEach(System.out::println);

        System.out.println("Sum of load capacity = " + ActionsAirplane.sumOfLoadCapacity(listAirplanes));
        System.out.println("Sum of capacity = " + ActionsAirplane.sumOfCapacity(listAirplanes));

        System.out.println("Sort by range of consumed fuel ");
        ActionsAirplane.sortByFuelCost(listAirplanes, MAX_CONSUMED_FUEL, MIN_CONSUMED_FUEL).forEach(System.out::println);

    }
}