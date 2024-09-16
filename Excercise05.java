import java.util.*;
public class Excercise05 {
	

	    public  int findSecondSmallest(ArrayList<Integer> list) {
	        if (list == null || list.size() < 2) {
	            return 0; 
	        }

	        Collections.sort(list);
	        int first=list.get(0);
	        for(int i=1;i<list.size();i++)
	        {
	        	if(list.get(i)>first)
	        	{
	        		return list.get(i);
	        	}
	        }
	      return 0;
	    }

public static void main(String args[])
{
	ArrayList<Integer> list = new ArrayList<>();
    Collections.addAll(list, 5, 3, 9, 1, 6, 1, 4);
    System.out.println(list);
    Excercise05 obj=new Excercise05();
    int second=obj.findSecondSmallest(list);
    System.out.print(second);
}
}
