public class Date {
    public static void main(String [] args) {
        String day = "Monday";
        String date = "27th";
        String month = "June";
        int year = 2016;
        System.out.println(day);
        System.out.println(date);
        System.out.println(month);
        System.out.println(year);
        System.out.println("American format:");
        System.out.println(day + ", " + month + " " + date + ", " + year); 
        System.out.println("European Format:");
        System.out.println(day + " " + date + " " + month + " " + year);
    }
}