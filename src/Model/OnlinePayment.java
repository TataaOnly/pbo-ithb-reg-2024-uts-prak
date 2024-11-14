package Model;

public class OnlinePayment extends Ticket {
    String transactionID;
    String paymentGateway;

    

    public OnlinePayment(String ticketID, String seatNumber, double price, Status ticketStatus, ClassType classType,
            String transactionID, String paymentGateway) {
        super(ticketID, seatNumber, price, ticketStatus, classType);
        this.transactionID = transactionID;
        this.paymentGateway = paymentGateway;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getPaymentGateway() {
        return paymentGateway;
    }

    public void setPaymentGateway(String paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    
    public void makePayment(){

    };
}
