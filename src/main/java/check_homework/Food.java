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
}


