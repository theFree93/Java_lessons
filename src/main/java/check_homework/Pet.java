package check_homework;

public class Pet {
    private String name;

    public static void tofaAndKrolyhaPlay(String name, String name1) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void catEat(Pet pet, Food food) {
        if (food.getAmountOfFeed() < 3 && food.getAmountOfFeed() >= 0) {
            System.out.println(pet.getName() + " it's very bad,need to eat three " + " " + food.getTypeOfFeed() + "a day");
        } else {
            System.out.println(pet.getName() + " this is a lot of " + " , need to eat no more than 3" + " " + food.getTypeOfFeed() + "a day");
        }
    }

    public void rabbitEat(Pet pet, Food food) {
        if (food.getAmountOfFeed() < 100) {
            System.out.println("This is very bad " + pet.getName() + " " + "needs no less than 100 grams hay ");
        } else if (food.getAmountOfFeed() <= 200) {
            System.out.println(pet.getName() + " has enough eat hay ");
        } else if (food.getAmountOfFeed() >= 301) {
            System.out.println("it's a lot of hay " + pet.getName() + "can feel bad ");

        } else {
            System.out.println("Not suitable amount of hay ");
        }
    }

    public void drink(Pet pet, int amountOfWaterInGrams) {
        if (amountOfWaterInGrams >= 0) {
            if (amountOfWaterInGrams < 100) {
                System.out.println(pet.getName() + " need more water");
            } else if (amountOfWaterInGrams <= 300) {
                System.out.println(pet.getName() + " has enough water");
            } else if (amountOfWaterInGrams > 301) {
                System.out.println(" it's a lot of water " + pet.getName() + "can feel bad");
            }
        } else {
            System.out.println("Not suitable amount of water ");
        }
    }


}
