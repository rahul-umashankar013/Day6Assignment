package java8;

public class First {
    public static void main(String args[])
    {   int a=5;
        int b=2;
    	I1 obj=(x,y)->System.out.print(Math.pow(a, b));
    	obj.power(a,b);
    	
    	
    }
}
