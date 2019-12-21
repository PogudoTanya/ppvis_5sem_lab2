import java.util.List;

public class Order {
    public List<Product> product;
    public List<Ticket> ticket;
    public int id;
    public float sum_order;
    public float sum_visitor;
    public float surrender;
    public int id_seller;
    public int id_visitor;
    public StatusOfOrder statusOfOrder = StatusOfOrder.NO_PAY;

    public void setStatusOfOrder(StatusOfTicket statusOfTicket) {
        this.statusOfOrder = statusOfOrder;
    }
    public float count_order() {
        return 0;
    }
    public void data_order() {
    }
}


