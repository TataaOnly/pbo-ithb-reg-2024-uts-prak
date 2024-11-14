package Model;

public abstract class Ticket {

    private String ticketID;
    private String seatNumber;
    private double price;
    private Status ticketStatus;
    private ClassType classType;

    public Ticket(String ticketID, String seatNumber, double price, Status ticketStatus, ClassType classType) {
        this.ticketID = ticketID;
        this.seatNumber = seatNumber;
        this.price = price;
        this.ticketStatus = ticketStatus;
        this.classType = classType;
    }

    public void printTicket() {

    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Status getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(Status ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public ClassType getClassType() {
        return classType;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }
}
