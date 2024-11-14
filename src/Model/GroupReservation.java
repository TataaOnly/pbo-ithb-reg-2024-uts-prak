package Model;

import java.sql.Date;
public class GroupReservation extends Ticket{
    String groupName;
    int numberofSeats;
    
    public GroupReservation(String ticketID, String seatNumber, Date reservationDate, double price, Status ticketStatus, ClassType classType,
            String groupName, int numberofSeats) {
        super(ticketID, seatNumber, price, ticketStatus, classType);
        this.groupName = groupName;
        this.numberofSeats = numberofSeats;
    }
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public int getNumberofSeats() {
        return numberofSeats;
    }
    public void setNumberofSeats(int numberofSeats) {
        this.numberofSeats = numberofSeats;
    }
}
