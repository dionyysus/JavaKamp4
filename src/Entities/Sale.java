package Entities;

public class Sale {

    private int id;
    private int gameId;
    private int salePrice;

    public Sale() {

    }

    public Sale(int id, int gameId, int salePrice) {
        super();
        this.id = id;
        this.gameId = gameId;
        this.salePrice = salePrice;
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
    public int getSalePrice() {
        return salePrice;
    }
    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }
}
