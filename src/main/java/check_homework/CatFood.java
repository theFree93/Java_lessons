package check_homework;

public class CatFood extends Food{
    public void catEat(Pet pet, int amountSausages ) {
        if (amountSausages < 3 && amountSausages >= 0) {
            System.out.println(pet.getName() + " it's very bad,need to eat three times a day");
        } else {
            System.out.println(pet.getName() + " this is a lot of " + pet.getName() + " " + "need to eat no more than 3 sausages a day");
        }
    }
}
