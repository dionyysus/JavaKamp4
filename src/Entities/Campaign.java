package Entities;

public class Campaign {


    private int id;
    private int gameId;
    private String CampaignName;
    private double beforeCampaingPrice;
    private int campaignPrice;

    public Campaign() {

    }

    public Campaign(int id, int gameId, String campaignName, double beforeCampaingPrice, int campaignPrice) {
        this.id = id;
        this.gameId = gameId;
        CampaignName = campaignName;
        this.beforeCampaingPrice = beforeCampaingPrice;
        this.campaignPrice = campaignPrice;
    }

    public double AfterCampaingPrice() {

        return this.beforeCampaingPrice - (this.beforeCampaingPrice * this.campaignPrice/100);
    }
    public Campaign(int id, int gameId, String campaignName, double beforeCampaingPrice) {
        super();
        this.id = id;
        this.gameId = gameId;
        CampaignName = campaignName;
        this.beforeCampaingPrice = beforeCampaingPrice;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getGameId() {
        return gameId;
    }
    public void setGameId(int gameId) {
        this.gameId = gameId;
    }
    public String getCampaignName() {
        return CampaignName;
    }
    public void setCampaignName(String campaignName) {
        CampaignName = campaignName;
    }
    public double getBeforeCampaingPrice() {
        return beforeCampaingPrice;
    }
    public void setBeforeCampaingPrice(double beforeCampaingPrice) {
        this.beforeCampaingPrice = beforeCampaingPrice;
    }

    public int getCampaignPrice() {
        return campaignPrice;
    }

    public void setCampaignPrice(int campaignPrice) {
        this.campaignPrice = campaignPrice;
    }

}
