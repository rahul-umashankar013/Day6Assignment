import java.util.*;
public class Excercise03 {
	
  public Map<Integer,Integer> getSquares(ArrayList<Integer> list)
  {  Map<Integer,Integer> mp=new HashMap<>();
	  for(int s : list)
	  {
		  mp.put(s,s*s);
	  }
	  return mp;
  }
  public static void main(String args[])
  
  {   Integer[] arr= {1,2,3,4,5};
	  List<Integer> llist=Arrays.asList(arr);
	  ArrayList<Integer> list=new ArrayList<>(llist);
	  
	  Excercise03 obj=new Excercise03();
	  Map<Integer,Integer> ans=obj.getSquares(list);
	  System.out.print(ans);
	  
  }
}
