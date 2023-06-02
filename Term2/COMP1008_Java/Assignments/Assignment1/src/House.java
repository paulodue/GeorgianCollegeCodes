public class House {

    public Integer houseNumberOfWalls;
    private String houseColor;
    protected Double housePrice;

    public House() {
    }

    public House(Integer numberOfWalls, String houseColor, Double housePrice) {
        this.houseNumberOfWalls = numberOfWalls;
        this.houseColor = houseColor;
        this.housePrice = housePrice;
    }

    public House(Integer numberOfWalls) {
        this.houseNumberOfWalls = numberOfWalls;
    }
    public House(String houseColor) {
        this.houseColor = houseColor;
    }
    public House(Double housePrice) {
        this.housePrice = housePrice;
    }
    public House(String houseColor, Double housePrice) {
        this.houseColor = houseColor;
        this.housePrice = housePrice;
    }
    public House(Double housePrice, Integer numberOfWalls) {
        this.housePrice = housePrice;
        this.houseNumberOfWalls = numberOfWalls;
    }

    public Integer getHouseNumberOfWalls() {
        return houseNumberOfWalls;
    }

    public void setHouseNumberOfWalls(Integer houseNumberOfWalls) {
        this.houseNumberOfWalls = houseNumberOfWalls;
    }

    public String getHouseColor() {
        return houseColor;
    }

    public void setHouseColor(String houseColor) {
        this.houseColor = houseColor;
    }

    public Double getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(Double housePrice) {
        this.housePrice = housePrice;
    }
}
