package check_homework;

public class MyFlat {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Zhenya");
        person.setSurname("Kiselev");
//        PersonActions.canSleep(person.getName());
//        PersonActions.canGetUp(person.getName());
//        PersonActions.canWatchTV(person.getName());
//        PersonActions.canOpenWindow(person.getName());
//        PersonActions.canUseLaptop(person.getName());
//        PersonActions.canSitOnTheChair(person.getName());
        PersonActions.actions(person.getName());


        Car car = new Car();
        car.setModel("BMW");
        car.setCarColour("black");
        car.canDriveACar(person);
        car.canWashTheCar(person);

        Cat cat = new Cat();
        Food food = new Food();
        cat.setName("Tofa");
        Cat catTofa = new Cat();
        catTofa.setName("Tofa");
        catTofa.lookForMice(catTofa);
        catTofa.drink(catTofa, 500);
        CatFood catFood = new CatFood();
        catFood.setTypeOfFeed("sausages");
        catFood.setAmountOfFeed(5);
        food.eat(catTofa, catFood);



        Rabbit rabbitKrolyha = new Rabbit();
        rabbitKrolyha.setName("Krolyha");
        rabbitKrolyha.drink(rabbitKrolyha, 100);
        RabbitFood rabbitFood = new RabbitFood();
        rabbitFood.setTypeOfFeed("hay");
        rabbitFood.setAmountOfFeed(200);
        food.eat(rabbitKrolyha, rabbitFood);
    }
}

