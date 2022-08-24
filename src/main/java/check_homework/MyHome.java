package check_homework;

public class MyHome {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Zhenya");
        person.setSurname("Kiselev");
        Actions.canSleep(person.getName());
        Actions.canGetUp(person.getName());
        Actions.canWatchTV(person.getName());
        Actions.canOpenWindow(person.getName());
        Car.canDriveACar(person.getName());
        Car.canWashTheCar(person.getName());




        Cat cat = new Cat();
        cat.setName("Tofa,");
        System.out.print(cat.getName());

        Rabbit rabbit = new Rabbit();
        rabbit.setName(" Krolyha ");
        System.out.println(rabbit.getName());

        Pet pet = new Pet();
        pet.needToEat(4, rabbit.getName(), cat.getName());
        Pet.tofaAndKrolyhaPlay(cat.getName(), rabbit.getName());
        pet.needToDrink(302, rabbit.getName(), cat.getName());
        Cat catCanDo = new Cat();
        catCanDo.lookForMice(cat.getName());



//        Persons somebody = new Persons();
//        somebody.sleep();
//        somebody.getUp();
//        somebody.watchTv();
//        somebody.openWindow();
//        Actions canDoing = new Actions();
//        canDoing.ZhenyaGetUp();
//        canDoing.ZhenyaWatchTV();
//        canDoing.ZhenyaWatchTV();
//        canDoing.ZhenyaOpenWindow();
//        canDoing.canSleep();
//
//        TofaKroluha aboutFeeding = new TofaKroluha();
//        aboutFeeding.waterForBoth(2);
//        aboutFeeding.feeding();
////
//        yauheni.useLaptop();
//        yauheni.sitOnTheChair();
//        yauheni.playPoker();
//        yauheni.callTaxa();
//
//
//
//        Car my = new Car();
//        my.driveMySelf();
//        my.accelerate();
//        my.stop();

    }
}

