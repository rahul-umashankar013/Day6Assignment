package methodreference;
import java.util.*;
public class First {
   public double powerCalculation(int num1,int num2)
   {
     return (Math.pow(num1,num2));
}
    public static void main(String args[])
    {
    	
    	
    	First obj=new First();
    	I1 obj1=obj::powerCalculation;
    	double number=obj1.power(5,2);
    	System.out.print(number);
    }
}