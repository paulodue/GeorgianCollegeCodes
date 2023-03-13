/**
 * This is Test 1 - COMP1030
 * @author Paulo Alves
 * @since 03/13/2023
 * @version 1.0
 */

public class Cars {

    private String color;
    private Integer numberOfWheels;


    public Cars(String color, Integer numberOfWheels) {
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }

    public Cars() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
