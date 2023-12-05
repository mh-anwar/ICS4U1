public class ExpirationDate {
    private int day;
    private int month;
    private int year;
    private int shelfLife;

    public ExpirationDate(int day, int month, int year, int shelfLife) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.shelfLife = shelfLife;

    }

    public ExpirationDate(String ddmmyyyy, int shelfLife) {
        day = Integer.parseInt(ddmmyyyy.substring(0, 2));
        month = Integer.parseInt(ddmmyyyy.substring(2, 4));
        year = Integer.parseInt(ddmmyyyy.substring(4, 8));
        this.shelfLife = shelfLife;
    }

    public String toString() {
        return "\nPackaged on: " + day + "-" + month + "-" + year + "\nExpires: " + shelfLife
                + " days after being packaged";
    }
}
// end class