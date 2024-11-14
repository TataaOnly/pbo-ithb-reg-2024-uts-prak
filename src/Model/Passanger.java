package Model;

public class Passanger extends Ticket{
    String passangerID;
    String passangerName;
    int passangerAge;
    int passangerGender;
    TrainType tipe;

    
    
    public Passanger(String ticketID, String seatNumber, double price, Status ticketStatus, ClassType classType,
            String passangerID, String passangerName, int passangerAge, int passangerGender, TrainType tipe) {
        super(ticketID, seatNumber, price, ticketStatus, classType);
        this.passangerID = passangerID;
        this.passangerName = passangerName;
        this.passangerAge = passangerAge;
        this.passangerGender = passangerGender;
        this.tipe = tipe;
    }
    

    public void getPassangerInfo(){
        
    }


    public String getPassangerID() {
        return passangerID;
    }


    public void setPassangerID(String passangerID) {
        this.passangerID = passangerID;
    }


    public String getPassangerName() {
        return passangerName;
    }


    public void setPassangerName(String passangerName) {
        this.passangerName = passangerName;
    }


    public int getPassangerAge() {
        return passangerAge;
    }


    public void setPassangerAge(int passangerAge) {
        this.passangerAge = passangerAge;
    }


    public int getPassangerGender() {
        return passangerGender;
    }


    public void setPassangerGender(int passangerGender) {
        this.passangerGender = passangerGender;
    }


    public TrainType getTipe() {
        return tipe;
    }


    public void setTipe(TrainType tipe) {
        this.tipe = tipe;
    }
}
