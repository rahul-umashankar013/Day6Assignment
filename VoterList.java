import java.util.*;
public class VoterList {
  public static void main(String args[])
  {  Map<Integer,Integer> mp=new HashMap<>();
     
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter id");
     int id=sc.nextInt();
     System.out.println("Enter date of birth");
     String date=sc.next();
     CalculateAge v=new CalculateAge();
     int age=v.Age(date);
     if(age>18)
     {
    	 mp.put(id,age);
     }
   //  for(Map.Entry<Integer,Integer> entry:mp.entrySet())
     //{
    //	 System.out.println(entry.getKey() + " " + entry.getValue());
   //  }
     System.out.println(mp);
	
  }
}
