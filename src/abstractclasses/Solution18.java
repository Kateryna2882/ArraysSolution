package abstractclasses;

/*
Updatable interface in the Screen class

*/

public class Solution18 {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen {

    }
}

