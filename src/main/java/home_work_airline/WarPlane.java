package home_work_airline;

public class WarPlane extends Plane {
    public WarPlane(TypeOfPlane type, double consumedFuel,  String model, int capacity, double loadCapacity, double rangeOfFlight) {
        super(type, consumedFuel, ModelPlane.valueOf(model), capacity, loadCapacity, rangeOfFlight);
    }

    public static boolean checkToWarPlane(Plane plane, TypeOfPlane typeOfPlane) {
        return plane.getType().equals(typeOfPlane);
    }
}



