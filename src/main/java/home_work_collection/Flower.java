package home_work_collection;

import java.util.Comparator;

public class Flower {


    private Flowers flowers;
    private Integer stemLength;
    private FreshnessLevel freshnessLevel;
    private double price;


    public Flower(Flowers flowers, Integer stemLength, FreshnessLevel freshnessLevel, double price) {
        this.flowers = flowers;
        this.stemLength = stemLength;
        this.freshnessLevel = freshnessLevel;
        this.price = price;
    }

    public static class sort implements Comparator<FreshnessLevel> {
        @Override
        public int compare(FreshnessLevel o1, FreshnessLevel o2) {
            return 0;
        }
    }


    public Flowers getFlowers() {
        return flowers;
    }

    public void setFlowers(Flowers flowers) {
        this.flowers = flowers;
    }

    public Integer getStemLength() {
        return stemLength;
    }

    public void setStemLength(Integer stemLength) {
        this.stemLength = stemLength;
    }

    public FreshnessLevel getFreshnessLevel() {
        return freshnessLevel;
    }

    public void setFreshnessLevel(FreshnessLevel freshnessLevel) {
        this.freshnessLevel = freshnessLevel;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Flower{");
        sb.append("flowers=").append(flowers);
        sb.append(", stemLength=").append(stemLength);
        sb.append(", freshnessLevel='").append(freshnessLevel).append('\'');
        sb.append(", price=' ").append(price);
        sb.append('}');
        return sb.toString();
    }
}
