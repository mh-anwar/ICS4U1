public class Jam {
    // Instance Variables
    public String contents; // type of fruit in the jar
    public ExpirationDate date; // date packaged and shelf Life
    public int capacity; // amount of jam in the jar

    // Constructors
    public Jam(String contents, ExpirationDate date, int size) {
        this.contents = contents;
        this.date = date;
        capacity = size;
    }

    public Jam(String contents, String date, int size) {
        this.contents = contents;
        this.date = new ExpirationDate(date, 200);
        capacity = size;
    }

    // Methods
    public boolean empty() {
        return (capacity == 0);
    }

    public String toString() {
        return contents + "\n" + date + "\n- Capacity: " + capacity + " ml.";
    }

    public void spread(int ml) {
        if (!empty()) {
            if (ml <= capacity) {
                Library.goMsg("Spreading " + ml + " ml " + contents);
                capacity = capacity - ml;
            } else {
                Library.goMsg("Spreading max capacity of " + capacity + " ml " + contents);
                capacity = 0;
            }
        } else
            Library.errorMsg("No jam in the Jar!");
    }

    public int getCapacity() {
        return capacity;
    }

}