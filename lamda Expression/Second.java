package java8;

public class Second {
	public static void main(String args[])
	{
      String s="CG";
      I2 obj=(str)->{
    	  System.out.println(s);
    	  StringBuilder s1=new StringBuilder(s);
    	  for(int i=1;i<s1.length();i+=2)
    	  {
    		 s1.insert(i," ");
    	  }
    	  System.out.println(s1);
      };
      
      obj.space(s);
}     
}
