package check_homework;

public class Pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
            System.out.println("Not suitable amount of water");
        }
    }
}



