import java.util.Scanner;
/**
 * Assignment4 - COMP1030
 * @author Paulo Alves
 * @version 1.0
 * since 02/2023
 */

public class MovieTicketTestHarness {
    public static void main(String[] args) {

        MovieTicket movie1 = new MovieTicket();
        
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Set a name for you movie -> ");
        String nameForMovie = scan1.next();
        movie1.setMovieName(nameForMovie);
        System.out.println("Name for the movie: " + movie1.getMovieName());

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Set your ticket number -> ");
        Integer ticketNumber = scan1.nextInt();
        movie1.setTicketNumber(ticketNumber);
        System.out.println("Your ticket number is: " + movie1.getTicketNumber());

        Scanner scan3 = new Scanner(System.in);
        System.out.print("Set a theatre number -> ");
        Integer theatreNumber = scan1.nextInt();
        movie1.setTheatreNumber(theatreNumber);
        System.out.println("Your theatre number is: " + movie1.getTheatreNumber());

        Scanner scan4 = new Scanner(System.in);
        System.out.print("Set a price for the ticket -> ");
        Double ticketPrice = scan4.nextDouble();
        MovieTicket.setTicketPrice(ticketPrice);
        System.out.println("The default value for all tickets is " + MovieTicket.getTicketPrice() + "CAD but the final value (with taxes) is " + MovieTicket.getTicketPriceWithTax() + "CAD");

        Scanner scan5 = new Scanner(System.in);
        System.out.print("Choose a movie actor -> ");
        String movieActor = scan5.next();
        movie1.movieRunTime(movieActor);

        Scanner scan6 = new Scanner(System.in);
        System.out.print("Choose a time to choose a movie -> ");
        Integer movieTime = scan5.nextInt();
        movie1.movieRunTime(movieTime);
    }
}
