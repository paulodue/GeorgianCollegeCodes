import java.util.Date;

public class Flight {

    private Integer numberFlight;
    private Date dateFlight;
    private String originAirport;
    private String destinationAirport;

    public Flight(Integer numberFlight, Date dateFlight, String originAirport, String destinationAirport) {
        this.numberFlight = numberFlight;
        this.dateFlight = dateFlight;
        this.originAirport = originAirport;
        this.destinationAirport = destinationAirport;
    }

    public Integer getNumberFlight() {
        return numberFlight;
    }

    public void setNumberFlight(Integer numberFlight) {
        this.numberFlight = numberFlight;
    }

    public Date getDateFlight() {
        return dateFlight;
    }

    public void setDateFlight(Date dateFlight) {
        this.dateFlight = dateFlight;
    }

    public String getOriginAirport() {
        return originAirport;
    }

    public void setOriginAirport(String originAirport) {
        this.originAirport = originAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }
}
