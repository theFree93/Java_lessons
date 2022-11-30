package home_work_airline;

public class CargoPlane extends Plane {
    public CargoPlane(TypeOfPlane type, double consumedFuel,  String model, int capacity, double loadCapacity, double rangeOfFlight) {
        super(type, consumedFuel, ModelPlane.valueOf(model), capacity, loadCapacity, rangeOfFlight);
    }

    public static boolean checkToCargoPlane(Plane plane, TypeOfPlane typeOfPlane) {
        return plane.getType().equals(typeOfPlane);
    }
}
