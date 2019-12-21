public class Ticket {
    public int id;
    public int attraction;
    public float price;
    public StatusOfTicket statusOfTicket = StatusOfTicket.NO_USE;

    public void setStatusOfTicket(StatusOfTicket statusOfTicket) {
        this.statusOfTicket = statusOfTicket;
    }
}
