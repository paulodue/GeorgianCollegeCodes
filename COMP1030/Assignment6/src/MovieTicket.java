/**
 * Assignment4 - COMP1030
 * @author Paulo Alves
 * @version 1.0
 * since 02/2023
 */

public class MovieTicket {
    private String movieName;
    private Integer ticketNumber;
    private Integer theatreNumber;
    private static Double ticketPrice = 10.0;

    static Double getTicketPrice() {
        return ticketPrice;
    }

    public static Double getTicketPriceWithTax() {
        return getTicketPrice() * 1.13;
    }

    public static void setTicketPrice(Double ticketPrice) {
        MovieTicket.ticketPrice = ticketPrice;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(Integer ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Integer getTheatreNumber() {
        return theatreNumber;
    }

    public void setTheatreNumber(Integer theatreNumber) {
        this.theatreNumber = theatreNumber;
    }

    public void movieRunTime(String actorName) {
        switch (actorName) {
            case "Tobey" -> System.out.println("The Spider-Man movie will be at 21h with " + actorName);
            case "Tom" -> System.out.println("Top Gun: Maverick starring is about to start starring " + actorName);
            case "diCaprio" -> System.out.println("The classic Titanic will start at 13h starring " + actorName);
            case "Steve" -> System.out.println("The serie The Office with " + actorName + " as Michael Scott will only be displayed tomorrow");
            default -> System.out.println("This actor will not be on TV today, sorry :( ");
        }
    }
    public void movieRunTime(Integer startTime) {
        switch (startTime) {
            case 13 -> System.out.println("Titanic will be on shown for you at this time");
            case 14 -> System.out.println("At 14h Tom Cruise will be on fire on the movie Top Gun: Maverick");
            case 19 -> System.out.println("The serie The Office will start at this time!");
            case 21 -> System.out.println("That time Spider-Man movie will be displayed with the star Tobey Maguire");
            default -> System.out.println("We are not getting a movie this time, just a match between Santos and Palmeiras for Soccer Brazilian Championship");
        }
    }
}
