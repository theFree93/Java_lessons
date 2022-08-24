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

    public void needToEat(int amountEat, String rabbitName, String name) {
        if (amountEat < 3) {
            System.out.println(name + " it's very bad,need to eat three times a day");
        } else {
            System.out.println("it's a lot, need to eat three times a day");
        }
    }

    public void needToDrink(int amountOfWaterInGrams, String rabbitName, String name) {

        if (amountOfWaterInGrams < 100) {
            System.out.println("need more water");
        } else if (amountOfWaterInGrams >= 300) {
            System.out.println("OK");
        } else if (amountOfWaterInGrams > 301) {

            System.out.println("it's a lot of water can go bad");
        }
    }
}

