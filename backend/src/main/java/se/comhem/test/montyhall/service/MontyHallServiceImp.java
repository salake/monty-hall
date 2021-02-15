package se.comhem.test.montyhall.service;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import se.comhem.test.montyhall.model.GameRequest;
import se.comhem.test.montyhall.model.GameResult;

import java.util.*;

@Service
public class MontyHallServiceImp implements MontyHallService {

 public GameResult play(GameRequest request) {
  int numberOfWins = 0;
  for(int i = 0; i < request.getNumberOfRounds(); i++) {
   List<Integer> doors = new ArrayList<>(Collections.nCopies(3, 0));
   int range = 3;
   int min = 0;
   Random random = new Random();
   int winnerIndex = random.nextInt(range) + min;
   doors.set(winnerIndex, 1);
   int chosenDoorIndex = random.nextInt(range) + min;

   if (request.getSwapDoor() && chosenDoorIndex != winnerIndex) {
    numberOfWins++;
   } else if (!request.getSwapDoor() && chosenDoorIndex == winnerIndex) {
    ++numberOfWins;
   }
  }
  return new GameResult(request.getNumberOfRounds(), request.getSwapDoor(), numberOfWins);
 }
}