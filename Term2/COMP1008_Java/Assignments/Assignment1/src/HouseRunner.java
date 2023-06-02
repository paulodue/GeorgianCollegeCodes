public class HouseRunner {
    public static void main(String[] args) {
        //1st instantiation
        House house1 = new House("red");
        //2nd instantiation
        House house2 = new House(35, "Yellow", 10000.00);
        //3rd instantiation
        House house3 = new House(50);

        System.out.println(house1.getHouseColor());
        System.out.println(house2.getHouseNumberOfWalls() + house2.getHouseColor() + house2.getHousePrice());
        System.out.println(house3.getHouseNumberOfWalls());
    }
}
