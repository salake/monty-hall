package se.comhem.test.montyhall.service;

import se.comhem.test.montyhall.model.GameRequest;
import se.comhem.test.montyhall.model.GameResult;

public interface MontyHallService {
 GameResult play(GameRequest employee);
}