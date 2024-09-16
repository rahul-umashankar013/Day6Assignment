package methodreference;

public class Fourth {
  public static int find(int num)
  {
	  int ans=1;
	   for(int i=1;i<=num;i++)
	   {
		   ans=ans*i;
	   }
	   return ans;
  }
  public static void main(String args[])
  {
	  I4 obj=Fourth::find;
	  int number=obj.factorial(5);
	  System.out.print(number);
  }
}
