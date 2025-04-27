package anthill;

public class Queen {

    public static Worker[] workers;
    public static Soldier[] soldiers;

    public static void main(String[] args) {
        populate();

        //write your code here
        for (int i = 0; i < workers.length; i++) {
            Worker woker = workers[i];
            woker.sendForFood();
        }
        for (int i = 0; i < soldiers.length; i++) {
            Soldier soldier = soldiers[i];
            soldier.sendIntoBattle();

        }
    }

    public static void populate() {
        workers = new Worker[800];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker();
        }

        soldiers = new Soldier[70];
        for (int i = 0; i < soldiers.length; i++) {
            soldiers[i] = new Soldier();
        
        }
    }
}
