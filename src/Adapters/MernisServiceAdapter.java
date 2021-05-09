package Adapters;

import Abstaracts.GamerCheckService;
import EDevletServiceAdapter.CALKPSPublicSoap;
import Entities.Gamer;


public class MernisServiceAdapter implements GamerCheckService {

    @Override
    public boolean checkIfRealPerson(Gamer gamer) {
        CALKPSPublicSoap calkpsPublicSoap = new CALKPSPublicSoap();
        try{
            return calkpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(gamer.getId()),gamer.getFirstName(),gamer.getLastName(),
                    gamer.getDate().getYear());
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return true;

    }


}
