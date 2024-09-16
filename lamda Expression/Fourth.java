package java8;
import java.util.*;
public class Fourth {
   public static void main(String args[])
   {  
	   I4 obj=(num)->{
		   int ans=1;
		   for(int i=1;i<=num;i++)
		   {
			   ans=ans*i;
		   }
		   return ans;
	   };
	   int number=obj.factorial(5);
	   System.out.print(number);
	   
   }
}
