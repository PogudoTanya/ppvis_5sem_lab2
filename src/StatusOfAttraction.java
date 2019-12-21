public enum StatusOfAttraction{
    NO_WORK(0),
    WORK(1);

    private int status;

    StatusOfAttraction(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}