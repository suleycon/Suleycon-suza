public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        this.month = (month >= 1 && month <= 12) ? month : 1;
        this.day = (day >= 1 && day <= 31) ? day : 1;
        this.year = year;
    }

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }

    public static void main(String[] args) {
        Date myDate = new Date(2, 30, 2023);
        myDate.displayDate();
    }
}