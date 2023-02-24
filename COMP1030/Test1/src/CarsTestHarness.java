/**
 * This is Test 1 - COMP1030
 * @author Paulo Alves
 * @since 02/13/2023
 * @version 1.0
 */
public class CarsTestHarness {
    public static void main(String[] args) {
        Cars car1 = new Cars("Yellow", 2);

        System.out.println("Hello, this are the informations for your brand new car: ");
        System.out.println("Car 1 color: " + car1.getColor());
        System.out.println("Car 1 number of wheels: " + car1.getNumberOfWheels());
        System.out.println("-------------------------**-----------------------------");

        Cars car2 = new Cars("Black", 1);
        System.out.println("The Second Car informations are: ");
        System.out.println("Car 2 color: " + car2.getColor());
        System.out.println("Car 2 number of wheels " + car2.getNumberOfWheels());

        car2.setColor("White");
        car2.setNumberOfWheels(6);

        System.out.println("-------------------------**-----------------------------");

        System.out.println("The informations for the second car changed: ");
        System.out.println("Now the color for Car 2 is: " + car2.getColor());
        System.out.println("The Car 2 number of wheels changed to: " + car2.getNumberOfWheels());



    }

}
