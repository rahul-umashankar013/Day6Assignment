package java8;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Third {
	 public static Map<String,String> mp=new HashMap<String,String>();
	  static {
		   mp.put("Admin","1234");
	    }
	  
	  public static void main(String args[])
	  {  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter Username");
		  String X=sc.next();
		  System.out.println("Enter Password");
		  String Y=sc.next();
		  I3 obj=(a,b)->{
			  
			  if(mp.containsKey(a))
			  {
				  return mp.get(a).equals(b);
			  }
			  return false;
		  };
		  if(obj.check(X,Y))
		  {
			  System.out.print("Authenticated");
		  }
		  else
		  {
			  System.out.print("Failed");
		  }
	  }
}
