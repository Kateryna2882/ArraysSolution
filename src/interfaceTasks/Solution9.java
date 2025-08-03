package interfaceTasks;
/*
All that moves

*/

public class Solution9 {
    public static void main(String[] args) {
    }

    interface CanMove {
        Double speed();
    }

    interface CanFly extends CanMove {
        Double speed(CanFly val);
    }
}

