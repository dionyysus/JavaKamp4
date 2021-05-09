package Abstaracts;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SaleService {

    void Sale(Game game, Gamer gamer);
    void SaleCampaign(Campaign campaign, Game game, Gamer gamer);
}
