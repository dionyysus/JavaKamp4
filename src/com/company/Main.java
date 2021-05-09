package com.company;


import Adapters.MernisServiceAdapter;
import Concretes.CampaignManager;
import Concretes.GameManager;
import Concretes.GamerManager;
import Concretes.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Sale;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
        Gamer gamer = new Gamer();
        gamer.setId("13063408218");
        gamer.setFirstName("Gizem");
        gamer.setLastName("Coşkun");
        gamer.setDate(LocalDate.of(2000,2,3));
        gamerManager.addGamer(gamer);

        GameManager gameManager = new GameManager();
        Game game = new Game();
        game.setId(1);
        game.setGameName("GTA");
        game.setGamePrice(2000);
        gameManager.add(game);

        CampaignManager campaignManager = new CampaignManager();
        Campaign campaign = new Campaign();
        campaign.setId(1);
        campaign.setCampaignName("Summer Campaign");
        campaign.setCampaignPrice(40);
        campaign.setBeforeCampaingPrice(200);
        campaign.setGameId(1);
        campaignManager.addCampaign(campaign);

        SaleManager saleManager = new SaleManager();
        Sale sale = new Sale();
        sale.setId(1);
        sale.setGameId(1);
        sale.setSalePrice(200);



    }
}
