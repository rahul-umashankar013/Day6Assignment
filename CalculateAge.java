import java.util.*;
public class CalculateAge {
   public int Age(String date)
   {
	   String[] str=date.split("\\.");
	   int day=Integer.parseInt(str[0]);
	   int month=Integer.parseInt(str[1]);
	   int year=Integer.parseInt(str[2]);
	   
	   Calendar today = Calendar.getInstance();
       int currentYear = today.get(Calendar.YEAR);
       int currentMonth = today.get(Calendar.MONTH) + 1; // Months are 0-based in Calendar
       int currentDay = today.get(Calendar.DAY_OF_MONTH);
       
       int age=currentYear-year;
       if (month > currentMonth || (month == currentMonth && day > currentDay)) {
           age--;
       }

       return age;
   }
}
