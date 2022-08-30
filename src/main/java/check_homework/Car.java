package check_homework;

public class Car{
    private String model;
    private String carColour;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarColour() {
        return carColour;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    public void canDriveACar(Person person) {
        System.out.println(person.getName() + " can drive" + " "+ carColour + model + " " + "car");
    }
    public void canWashTheCar(Person person){
        System.out.println(person.getName() + " " + "can wash " + getCarColour() + model );

    }


}
