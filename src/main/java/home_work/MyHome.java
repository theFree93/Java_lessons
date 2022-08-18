package home_work;

public class MyHome {
    public static void main(String[] args) {
        Zhenya yauheni = new Zhenya();
        Actions canDoing = new Actions();
        canDoing.ZhenyaCanSleep();
        canDoing.ZhenyaGetUp();
        canDoing.ZhenyaWatchTV();
        canDoing.ZhenyaWatchTV();
        canDoing.ZhenyaOpenWindow();
        TofaKroluha aboutFeeding = new TofaKroluha();
        aboutFeeding.waterForBoth(2);
        aboutFeeding.feeding();
        yauheni.useLaptop();
        yauheni.sitOnTheChair();
        yauheni.playPoker();
        yauheni.callTaxa();
        Car my = new Car();
        my.driveMySelf();
        my.accelerate();
        my.stop();
    }
}

