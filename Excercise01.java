import java.util.*;
public class Excercise01 {
	
	public ArrayList<String> getValues(Map<Integer,String> mp)
	{
		ArrayList<String> list=new ArrayList<>();
		for(Map.Entry<Integer,String> entry:mp.entrySet())
		{
			list.add(entry.getValue());
		}
		Collections.sort(list);
		return list;
		
	}
    public static void main(String args[])
    {
    	Map<Integer,String> mp=new HashMap<>();
    	mp.put(1, "Rahul");
    	mp.put(2, "rishabh");
    	mp.put(3, "Bala");
    	Excercise01 obj=new Excercise01();
    	
    	ArrayList<String> ans=obj.getValues(mp);
    	for(String s:ans)
    	{
    		System.out.println(s);
    	}
    	
    }
}
