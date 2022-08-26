package check_homework;

public class RabbitFood extends Food{
    public void rabbitEat(Pet pet, int amountOfHayInGram) {
        if (amountOfHayInGram < 100) {
            System.out.println( "This is very bad " + pet.getName() + " " + "needs no less than 100 grams hay ");
        } else if (amountOfHayInGram <= 200) {
            System.out.println(pet.getName() + " has enough eat hay ");
        } else if (amountOfHayInGram >= 201) {
            System.out.println("it's a lot of hay " + pet.getName() + " " + "can feel bad ");

    } else {
        System.out.println("Not suitable amount of hay ");



        }}}

//        if (amountOfWaterInGrams >= 0){
//            if (amountOfWaterInGrams < 100) {
//                System.out.println(pet.getName() + " need more water");
//            } else if (amountOfWaterInGrams <= 300) {
//                System.out.println(pet.getName() + " has enough water");
//            } else if (amountOfWaterInGrams > 301) {
//                System.out.println(" it's a lot of water" + pet.getName() + "can feel bad");
//            }
//        } else {
//            System.out.println("Not suitable amount of water ");
