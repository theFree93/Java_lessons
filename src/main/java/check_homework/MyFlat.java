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
        cat.setName("Tofa,");

        Pet pet = new Pet();
        Cat catTofa = new Cat();
        catTofa.setName("Tofa");
        catTofa.lookForMice(cat.getName());
        catTofa.drink(catTofa, 200);



        Rabbit rabbitKrolyha = new Rabbit();
        rabbitKrolyha.setName("Krolyha");
        rabbitKrolyha.drink(rabbitKrolyha, 100);

        Food food = new Food();
        CatFood catFood = new CatFood();
        RabbitFood rabbitFood = new RabbitFood();
        catFood.setTypeOfFeed("sausages");
        rabbitFood.setTypeOfFeed("hay");
        catFood.catEat(catTofa, 1);
        rabbitFood.rabbitEat(rabbitKrolyha, 800);





    }
}

