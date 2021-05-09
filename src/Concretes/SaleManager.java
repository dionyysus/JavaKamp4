package Concretes;

import Abstaracts.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService {


    @Override
    public void Sale(Game game, Gamer gamer) {
        System.out.println(gamer.getFirstName() + gamer.getLastName()+"buyed"+game.getGameName());
    }

    @Override
    public void SaleCampaign(Campaign campaign, Game game, Gamer gamer) {
        System.out.println(campaign.getCampaignName()+"applied to"+game.getGameName() + "and buyed"+gamer.getFirstName()+gamer.getLastName());
    }
}

