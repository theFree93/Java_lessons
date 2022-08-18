package home_work;

public class Actions {
    public void ZhenyaCanSleep() {
        Zhenya actionsSleep = new Zhenya();
        System.out.print("Zhenya can ");
        actionsSleep.sleep();
        System.out.println();
    }

    public void ZhenyaGetUp() {
        Zhenya actionsGetUp = new Zhenya();
        System.out.print("Zhenya can ");
        actionsGetUp.getUp();
        System.out.println();
    }

    public void ZhenyaWatchTV() {
        Zhenya actionsWatchTV = new Zhenya();
        System.out.print("Zhenya can ");
        actionsWatchTV.watchTv();
        Pets actionsPets = new Pets();
        System.out.print("can sleep at the moment ");
        actionsPets.tofa();
        System.out.println();
    }

    public void ZhenyaOpenWindow() {
        Zhenya actionOpenWindow = new Zhenya();
        System.out.print("Zhenya can ");
        actionOpenWindow.openWindow();
        Pets actionPets = new Pets();
        actionPets.Krolyha();
        System.out.print("be afraid of noise at the moment");
        System.out.println();
        actionPets.tofa();
        System.out.println("looking out the window at the moment");
        System.out.println();
    }
}

