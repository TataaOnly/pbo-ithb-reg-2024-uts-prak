package Model;

import java.sql.Date;
public class Reservation extends Ticket{
    String reservationID;

    public Reservation(String reservationID, String ticketID, Date reservationDate, String seatNumber, double price, Status ticketStatus, ClassType classType) {
        super(ticketID, seatNumber, price, ticketStatus, classType);
        this.reservationID = reservationID;
    }

    

    public String getReservationID() {
        return reservationID;
    }

    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }
    
    public void reserveSeat(){
        //make reservation
    }
    public void cancelReservation(){
        // cancel reservation
    }
}
