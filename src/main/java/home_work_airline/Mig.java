package home_work_airline;

public class Mig extends WarPlane {
    public Mig(TypeOfPlane type, double consumedFuel, ModelPlane model, int capacity, double loadCapacity, double rangeOfFlight) {
        super(type, consumedFuel, String.valueOf(model), capacity, loadCapacity, rangeOfFlight);
    }
}
