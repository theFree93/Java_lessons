package home_work_collection;


import java.util.*;

import static home_work_collection.Flowers.*;
import static home_work_collection.FreshnessLevel.*;


public class Bouquet {
    private static final int LOWER_FRESHNESS_LEVEL = 12;
    private static final int TOP_LEVEL_OF_FRESHNESS = 26;

    public static void main(String[] args) {
        List<Flower> flowersList = Arrays.asList(new Flower(ROSE, 8, LOW, 30.2),
                new Flower(LILY_OF_THE_VALLEY, 23, HIGH, 21.3),
                new Flower(TULIPS, 25, LOW, 15.8),
                new Flower(CARNATIONS, 43, AVERAGE, 32.3));
        flowersList.sort(Comparator.comparing(Flower::getFreshnessLevel));
        System.out.println(flowersList);

        double sumOfPrice = 0;
        for (int i = 0; i < flowersList.size(); i++) {
            if (flowersList.get(i).getStemLength() >= LOWER_FRESHNESS_LEVEL && TOP_LEVEL_OF_FRESHNESS >= flowersList.get(i).getStemLength()) {
            }
            sumOfPrice += flowersList.get(i).getPrice();
        }
        System.out.println(sumOfPrice);
    }
}