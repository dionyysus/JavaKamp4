package Concretes;

import Abstaracts.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println("Campaign was Added: "+ campaign.getCampaignName());
    }

    @Override
    public void updateCampaign(Campaign campaign) {
        System.out.println("Campaign updated!");
        System.out.println("New Price of: "+ campaign.getCampaignName() + "is" + campaign.AfterCampaingPrice());
    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + "was deleted");

    }
}
