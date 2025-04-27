import java.util.Arrays;

public class FavoriteBoardGames {


    public static BoardGame[] collection = new BoardGame[5];

    public static void main(String[] args) {
        collection[0] = new BoardGame();
        collection[0].name = "Stratego";

        collection[1] = new BoardGame();
        collection[1].name = "Battleship";

        collection[2] = new BoardGame();
        collection[2].name = "Risk";

        collection[3] = new BoardGame();
        collection[3].name = "Monopoly";

        collection[4] = new BoardGame();
        collection[4].name = "Axis & Allies";

        System.out.println(Arrays.toString(collection));
    }
}
