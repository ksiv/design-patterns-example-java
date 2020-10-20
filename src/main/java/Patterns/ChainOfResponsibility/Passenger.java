package Patterns.ChainOfResponsibility;

public class Passenger {
    private String luggage;
    private String ticket;
    private String passport;
    Passenger(String luggage, String ticket, String passport){
        this.luggage = luggage;
        this.passport=passport;
        this.ticket=ticket;
    }
    public String getTicket() {
        return this.ticket;
    }

    public String getPassport() {
        return this.passport;
    }

    public String getLuggage() {
        return this.luggage;
    }

}
