package home_work_airline;
import java.util.Objects;

public abstract class Plane implements Comparable<Plane> {
    private TypeOfPlane type;
    private ModelPlane model;
    private int capacity;
    private double loadCapacity;
    private double rangeOfFlight;
    private double consumedFuel;


    public Plane(TypeOfPlane type,double consumedFuel, ModelPlane model, int capacity, double loadCapacity, double rangeOfFlight) {
        this.type = type;
        this.model = model;
        this.capacity = capacity;
        this.loadCapacity = loadCapacity;
        this.rangeOfFlight = rangeOfFlight;
        this.consumedFuel = consumedFuel;


    }

    public TypeOfPlane getType() {
        return type;
    }

    public void setType(TypeOfPlane type) {
        this.type = type;
    }

    public ModelPlane getModel() {
        return model;
    }

    public void setModel(ModelPlane model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getRangeOfFlight() {
        return rangeOfFlight;
    }

    public void setRangeOfFlight(double rangeOfFlight) {
        this.rangeOfFlight = rangeOfFlight;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getConsumedFuel() {
        return consumedFuel;
    }

    public void setConsumedFuel(double consumedFuel) {
        this.consumedFuel = consumedFuel;
    }

    @Override
    public int compareTo(Plane o1) {
        double result =  rangeOfFlight - o1.rangeOfFlight;
        double value = 0;
        if (result > 0) {
            value = 1;
        } else if (result < 0) {
            value = -1;
        }
        return (int) value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plane plane = (Plane) o;

        if (capacity != plane.capacity) return false;
        if (Double.compare(plane.loadCapacity, loadCapacity) != 0) return false;
        if (Double.compare(plane.rangeOfFlight, rangeOfFlight) != 0) return false;
        if (Double.compare(plane.consumedFuel, consumedFuel) != 0) return false;
        if (type != plane.type) return false;
        return Objects.equals(model, plane.model);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = type != null ? type.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + capacity;
        temp = Double.doubleToLongBits(loadCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(rangeOfFlight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(consumedFuel);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Plane{");
        sb.append("type=").append(type);
        sb.append(", model='").append(model).append('\'');
        sb.append(", capacity=").append(capacity);
        sb.append(", loadCapacity=").append(loadCapacity);
        sb.append(", rangeOfFlight=").append(rangeOfFlight);
        sb.append(", consumedFuel=").append(consumedFuel);
        sb.append('}');
        return sb.toString();
    }
}

