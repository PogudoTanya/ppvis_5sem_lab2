public class Attraction {
        public int id;
        public String name;
        public String category;
        public int length;
        public float cost;
        public int count_of_seats;
        public int count_of_busy_seats;
        public StatusOfAttraction statusOfAttraction = StatusOfAttraction.NO_WORK;

        public void setStatusOfAttraction(StatusOfAttraction statusOfAttraction) {
                this.statusOfAttraction = statusOfAttraction;
        }
    }

