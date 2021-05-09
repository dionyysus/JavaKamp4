package Concretes;

import Abstaracts.GameService;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService {

    public void GamerManager(){

    }

    @Override
    public void add(Game game) {

        System.out.println("Added game: " + game.getGameName());

    }

    @Override
    public void delete(Game game) {

        System.out.println("Deleted game: " + game.getGameName());

    }

    @Override
    public void update(Game game) {

        System.out.println("Updated game: " + game.getGameName());

    }

}
