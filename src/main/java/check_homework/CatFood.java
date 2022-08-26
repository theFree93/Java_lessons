package check_homework;

public class CatFood extends Food {
    public void catEat(Pet pet, int amountSausages) {
        switch (amountSausages) {
            case (6):
                System.out.println("That's a lot of, " + pet.getName() + " " + "can fell bad");
                break;
            case 5:
                System.out.println(pet.getName() + " 3 sausages are enough, that's a lot");
                break;
            case 4:
                System.out.println(pet.getName() + " 3 sausages are enough, that's a lot");
                break;
            case 3:
                System.out.println(pet.getName() + " has enough eat");
                break;
            case 2:
                System.out.println("this is very bad you need to eat at least 3 sausages a day");
                break;
            default:
                System.out.println("Not suitable amount of sausages");



        }
//        if (amountSausages < 3 && amountSausages >= 0) {
//            System.out.println(pet.getName() + " it's very bad,need to eat three times a day");
//        } else {
//            System.out.println(pet.getName() + " this is a lot of " + pet.getName() + " " + "need to eat no more than 3 sausages a day");
//        }
    }
}
