package second_lesson;

public class Home {

    public static void main(String[] args) {
        Zhenya zhenya = new Zhenya();
        zhenya.openDoor();
        zhenya.eat();
        zhenya.openDoor();
        zhenya.openDoor();
        zhenya.eat();
        zhenya.sleep();
        System.out.println(Zhenya.callOnThePhone("iphone"));
    }
}
