/**
 * This is Test 1 - COMP1030
 * @author Paulo Alves
 * @since 03/13/2023
 * @version 1.0
 */
public class CarsTestHarness {
    public static void main(String[] args) {

        Cars car1 = new Cars("Yellow", 2);

        System.out.println("Hello, this are the informations for your brand new car: ");
        System.out.println("Car 1 color: " + car1.getColor());
        System.out.println("Car 1 number of wheels: " + car1.getNumberOfWheels());
        System.out.println("-------------------------**-----------------------------");

        Cars car2 = new Cars();
        System.out.println("All right! We created a new car but all the characteristics for this car is empty :(");
        System.out.println("We are going to instantiate this car now");
        car2.setColor("Blue");
        car2.setNumberOfWheels(4);
        System.out.println("The Second Car informations are: ");
        System.out.println("Car 2 color: " + car2.getColor());
        System.out.println("Car 2 number of wheels " + car2.getNumberOfWheels());
    }
}
