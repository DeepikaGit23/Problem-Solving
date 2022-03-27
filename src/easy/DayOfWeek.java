package problemSolving;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class DayOfWeek {
		
	public static String findDay(int month, int day, int year) {
        List<String> lt= Arrays.asList("MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY");
        // Date d= new Date(year, month, day);
        // return lt.get(d.getDay());
        LocalDate localDate = LocalDate.of(year, month, day);

   System.out.println(localDate.getDayOfWeek());
   

    return "";
    }
	
	public static void main(String[] args) {
		findDay(2,14,2022);
	}
	
}
