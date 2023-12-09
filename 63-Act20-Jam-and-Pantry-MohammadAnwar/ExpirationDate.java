import java.util.Date;

public class ExpirationDate {
    private int day;
    private int month;
    private int year;
    private int shelfLife;
    public Date normalDate;

    public String ddmmyyyy;

    public ExpirationDate(int day, int month, int year, int shelfLife) {
        // could check if date is valid
        this.day = day;
        this.month = month;
        this.year = year;
        this.shelfLife = shelfLife;
        normalDate = new Date(this.year, this.month - 1, this.day);
        ddmmyyyy = String.valueOf(day) + String.valueOf(month) + String.valueOf(year);
    }

    public ExpirationDate(String ddmmyyyy, int shelfLife) {
        this.day = Integer.parseInt(ddmmyyyy.substring(0, 2));
        this.month = Integer.parseInt(ddmmyyyy.substring(2, 4));
        this.year = Integer.parseInt(ddmmyyyy.substring(4, 8));
        this.shelfLife = shelfLife;
        normalDate = new Date(this.year, this.month - 1, this.day);

        this.ddmmyyyy = ddmmyyyy;
    }

    public String toString() {
        return "- Packaged on: " + day + "-" + month + "-" + year + "\n- Expires: " + shelfLife
                + " days after being packaged";
    }
}// end class