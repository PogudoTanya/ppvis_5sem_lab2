public enum StatusOfTicket {
    NO_USE(0),
    USE(1);

    private int status;

    StatusOfTicket(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
