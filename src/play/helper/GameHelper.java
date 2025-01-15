package play.helper;

import play.entity.Player;
import play.entity.Result;
import play.entity.Triple;
import play.enums.PlayType;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

import static play.enums.PlayType.*;

public class GameHelper {
    private static final PlayType[] PLAY_TYPES = {ROCK, PlayType.PAPER, PlayType.SCISSORS};
    private static final Triple[] COMBINATION_PAIRS = {
            Triple.of(ROCK, SCISSORS, ROCK),
            Triple.of(ROCK, PAPER, PAPER),
            Triple.of(ROCK, ROCK, DRAW),
            Triple.of(SCISSORS, ROCK, ROCK),
            Triple.of(SCISSORS, PAPER, SCISSORS),
            Triple.of(SCISSORS, SCISSORS, DRAW),
            Triple.of(PAPER, ROCK, PAPER),
            Triple.of(PAPER, SCISSORS, SCISSORS),
            Triple.of(PAPER, PAPER, DRAW),
    };

    public static PlayType getRandomType() {
        return PLAY_TYPES[ThreadLocalRandom.current().nextInt(0, PLAY_TYPES.length)];
    }

    public static Result getWinner(Player playerOne, Player playerTwo) {
        PlayType result = getResult(playerOne.getChoice(), playerTwo.getChoice());
        return result == DRAW ?
                new Result() : result == playerOne.getChoice() ? new Result(playerOne) : new Result(playerTwo);
    }

    public static PlayType getResult(PlayType first, PlayType second) {
        PlayType result = UNKNOWN;
        for (Triple triple : COMBINATION_PAIRS) {
            if (triple.getFirst() == first && triple.getSecond() == second) {
                result = triple.getWinner();
                break;
            }
        }
        return result;
    }

    public static String getInput() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            return bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
