public enum StatusOfOrder {
    NO_PAY(0),
    PAY(1);

    private int status;

    StatusOfOrder(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
