public class Time{
    public static void main(String [] args) {
        double hour = 22.0;
        double minute = 35.0;
        double second = 33.0;
        double start_time_in_secs, finish_time_in_secs, elapsed_time_in_secs;
        double elapsed_hour, elapsed_minute, elapsed_second;
        
        start_time_in_secs = ((hour * 60 * 60) + (minute * 60) + second);
        
        System.out.print("The number of seconds since midnight:");
        System.out.println(start_time_in_secs);
        System.out.print("The number of seconds until midnight:");
        System.out.println((60 * 60 * 24) - ((hour * 60 * 60) + (minute * 60) + second));
        System.out.print("Percentage of the day (24hrs) passed:");
        System.out.println((((hour * 60.0 * 60.0) + (minute * 60.0) + second) * 100.0)/(60*60*24));
       
        hour = 23.0;
        minute = 35.0;
        second = 33.0;
        
        System.out.print("The number of seconds since midnight:");
        finish_time_in_secs = ((hour * 60 * 60) + (minute * 60) + second);
        System.out.println(finish_time_in_secs);
        
        //Calculate the duration in secs
        elapsed_time_in_secs = finish_time_in_secs - start_time_in_secs;
        System.out.println("Elapsed time:" + elapsed_time_in_secs);
        
        //Calculate the hour
        elapsed_hour = elapsed_time_in_secs % 86400 / 3600;
        System.out.print("Hour:" + elapsed_hour + ", ");
        
        //Calculate the minutes
        elapsed_minute = (elapsed_time_in_secs % 86400) % 3600 / 60;
        System.out.print("Minute:" + elapsed_minute + ", ");
        
        //Calculate the seconds
        elapsed_second = ((elapsed_time_in_secs % 86400) % 3600) % 60;
        System.out.print("Second:" + elapsed_second + ", ");
        
    }
}
        