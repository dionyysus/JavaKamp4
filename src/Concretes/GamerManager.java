package Concretes;

import Abstaracts.GamerCheckService;
import Abstaracts.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {

    private GamerCheckService gamerCheckService;

    public GamerManager(GamerCheckService gamerCheckService){
        super();
        this.gamerCheckService = gamerCheckService;
    }

    @Override
    public void addGamer(Gamer gamer) {

        if(gamerCheckService.checkIfRealPerson(gamer)){
            System.out.println("User was added to game: " + gamer.getFirstName() + " " + gamer.getLastName());
        }
        else{
            System.out.println("Not a valid person");
        }

    }

    @Override
    public void updateGamer(Gamer gamer) {

        System.out.println("Gamer updated"+gamer.getFirstName());
    }

    @Override
    public void deleteGamer(Gamer gamer) {

        System.out.println(gamer.getFirstName()+ gamer.getLastName() + "Gamer deleted");


    }

}
