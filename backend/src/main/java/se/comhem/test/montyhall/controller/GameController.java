package se.comhem.test.montyhall.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import se.comhem.test.montyhall.model.GameRequest;
import se.comhem.test.montyhall.model.GameResult;
import se.comhem.test.montyhall.service.MontyHallService;

@RestController
public class GameController {

    @Autowired
    MontyHallService montyHallService;

    @PostMapping(path = "/play", consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public GameResult play(@RequestBody GameRequest gameRequest){
        GameResult result = montyHallService.play(gameRequest);
        return result;
    }
}