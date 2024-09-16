package methodreference;

public class Second {
public void dospace(String s)
{
	 StringBuilder s1=new StringBuilder(s);
	  for(int i=1;i<s1.length();i+=2)
	  {
		 s1.insert(i," ");
	  }
	  System.out.println(s1);
}
public static void main(String args[])
{   String str="rahul";
	Second obj=new Second();
	I2 obj1=obj::dospace;
	obj1.space(str);
	
}
}
