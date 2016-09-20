public class printDate {
    
    public static void printAmerican(String day, String month, int date, int year){
        System.out.print(day + ", ");
        System.out.print(month + " ");
        System.out.print(date + ", ");
        System.out.println(year);
    }
    
    public static void printEuropean(String day, int date, String month, int year){
        System.out.print(day + ", ");
        System.out.print(date + " ");
        System.out.print(month + ", ");
        System.out.println(year);
    }
    
    public static void main(String[] args){
        printAmerican("Tuesday","September",20,2016);
        printEuropean("Tuesday", 20, "September", 2016);
        
    }

}
