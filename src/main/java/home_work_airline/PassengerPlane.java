package home_work_airline;

public class PassengerPlane extends Plane {
    public PassengerPlane(double consumedFuel, TypeOfPlane type, ModelPlane model, int capacity, double loadCapacity, double rangeOfFlight) {
        super(type, consumedFuel, model, capacity, loadCapacity, rangeOfFlight);
    }

    public static boolean checkToPassengerPlane(Plane plane,TypeOfPlane typeOfPlane) {
         return plane.getType().equals(typeOfPlane);
    }


}
