public class BoardGame {

    String name;

    public BoardGame() {
    }

    public BoardGame(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
