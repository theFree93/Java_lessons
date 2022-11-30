package home_work_airline;

public class Airbus extends CargoPlane{
    public Airbus(TypeOfPlane type, double consumedFuel, ModelPlane model, int capacity, double loadCapacity, double rangeOfFlight) {
        super(type, consumedFuel, String.valueOf(model), capacity, loadCapacity, rangeOfFlight);
    }
}
