package play.entity;

import play.enums.PlayType;
import play.enums.PlayerType;

public class Player {
    private String name;
    private PlayType choice;
    private PlayerType playerType;

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayType getChoice() {
        return choice;
    }

    public void setChoice(PlayType choice) {
        this.choice = choice;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public boolean isComputer() {
        return playerType == PlayerType.COMPUTER;
    }
}
