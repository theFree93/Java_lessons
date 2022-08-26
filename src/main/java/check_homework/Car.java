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

    public String getCarColour(String black) {
        return carColour;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    public void canDriveACar(Person person){
        System.out.println(person.getName() + " can drive" + " " + getModel() + " " + "car");
    }
    public void canWashTheCar(Person person){
        System.out.println(person.getName() + " " + "can wash " + getModel() );

    }


}
