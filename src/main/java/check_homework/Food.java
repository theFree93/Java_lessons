package check_homework;

public class Food {
    private int amountOfFeed;

    public int getAmountOfFeed() {
        return amountOfFeed;
    }

    public void setAmountOfFeed(int amountOfFeed) {
        this.amountOfFeed = amountOfFeed;
    }

    private String typeOfFeed;

    public String getTypeOfFeed() {
        return typeOfFeed;
    }

    public void setTypeOfFeed(String typeOfFeed) {
        this.typeOfFeed = typeOfFeed.toLowerCase();

    }


    public void eat(Pet pet, Food food) {
        if (food.getAmountOfFeed() >= 0) {
            switch (food.getTypeOfFeed()) {
                case "sausages":
                    amountSausages(food, pet);
                    break;
                case "hay":
                    amountHay(pet, food);
                    break;
                default:
                    System.out.println("this food is not suitable for this pet");
            }
        } else {
            System.out.println("no suitable amount sausages");
        }
    }


    private void amountSausages(Food food, Pet pet) {
        if (food.getAmountOfFeed() < 3 && food.getAmountOfFeed() >= 0) {
            System.out.println(pet.getName() + " it's very bad,need to eat three " + " " + food.getTypeOfFeed() + "a day");
        } else {
            System.out.println(pet.getName() + " this is a lot of " + " , need to eat no more than 3" + " " + food.getTypeOfFeed() + "a day");
        }
    }

    private void amountHay(Pet pet, Food food) {
        if (food.getAmountOfFeed() < 100) {
            System.out.println("This is very bad " + pet.getName() + " " + "needs no less than 100 grams hay");
        } else if (food.getAmountOfFeed() <= 200) {
            System.out.println(pet.getName() + " has enough eat hay");
        } else if (food.getAmountOfFeed() >= 301) {
            System.out.println("it's a lot of hay " + pet.getName() + "can feel bad");
        } else {
            System.out.println("Not suitable amount of hay");
        }
    }
}



