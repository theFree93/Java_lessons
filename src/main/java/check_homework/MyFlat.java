package check_homework;

public class MyFlat {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Zhenya");
        person.setSurname("Kiselev");
        PersonActions.canSleep(person.getName());
        PersonActions.canGetUp(person.getName());
        PersonActions.canWatchTV(person.getName());
        PersonActions.canOpenWindow(person.getName());

        Car car = new Car();
        car.setModel("BMW");
        car.setCarColour("black");
        car.canDriveACar(person);
        car.canWashTheCar(person);

        Cat cat = new Cat();
        cat.setName("Tofa");
        Cat catTofa = new Cat();
        catTofa.setName("Tofa");
        catTofa.lookForMice(catTofa);
        catTofa.drink(catTofa, 200);
        CatFood catFood = new CatFood();
        catFood.setTypeOfFeed("sausages");
        catFood.setAmountOfFeed(5);
        catTofa.catEat(catTofa, catFood);


        Rabbit rabbitKrolyha = new Rabbit();
        rabbitKrolyha.setName("Krolyha");
        rabbitKrolyha.drink(rabbitKrolyha, 100);
        RabbitFood rabbitFood = new RabbitFood();
        rabbitFood.setTypeOfFeed("hay");
        rabbitFood.setAmountOfFeed(200);
        rabbitKrolyha.rabbitEat(rabbitKrolyha, rabbitFood);
    }
}

