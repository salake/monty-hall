package se.comhem.test.montyhall.model;

import io.micrometer.core.ipc.http.HttpSender;
import org.springframework.http.HttpStatus;

public class GameResult {

    private final int numberOfRounds;
    private final boolean swapDoor;
    private final int numberOfWins;
    private final float percentageWon;

    public GameResult(int numberOfRounds, boolean swapDoor, int numberOfWins) {
        this.numberOfRounds = numberOfRounds;
        this.swapDoor = swapDoor;
        this.numberOfWins = numberOfWins;
        this.percentageWon = (numberOfWins * 100.0f) / numberOfRounds;
    }

    public int getNumberOfRounds(){
        return this.numberOfRounds;
    }
    public boolean getSwapDoor(){
        return this.swapDoor;
    }
    public int getNumberOfWins(){
        return this.numberOfWins;
    }

    public float getPercentageWon(){
        return this.percentageWon;
    }
}