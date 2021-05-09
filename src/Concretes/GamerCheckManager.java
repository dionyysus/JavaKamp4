package Concretes;

import Abstaracts.GamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements GamerCheckService {


    @Override
    public boolean checkIfRealPerson(Gamer gamer) {
        return true;
    }
}
