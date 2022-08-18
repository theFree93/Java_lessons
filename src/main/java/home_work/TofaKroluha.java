package home_work;

public class TofaKroluha {
    public Zhenya yauheni;

    public void feeding() {
        Pets dailyFeeding = new Pets();
        dailyFeeding.feedMyPets();
        System.out.println();
    }



    public void waterForBoth(int weightInGrams) {
        Pets.poorTheWater(Pets.poorTheWater("for both every morning"));
        feeding(weightInGrams);
    }

    public void feeding(int weightInGrams) {
        System.out.println(weightInGrams);
    }
}
