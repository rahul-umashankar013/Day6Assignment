import java.util.*;
public class Excercise02 {
	public Map<Character,Integer> countChars(char[] arr)
	{  Map<Character,Integer> mp=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
			
		}
		return mp;
	}
   public static void main(String args[])
   {
	   char[] arr= {'a','b','c','d','d',};
	   Excercise02 obj=new Excercise02();
	   
	   Map<Character,Integer> ans=obj.countChars(arr);
	   System.out.print(ans);
	   
   }
}
