import java.util.*;
public class Student {
	public Map<Integer,String> Medals(Map<Integer,Integer> mp)
	{  Map<Integer,String> ans=new HashMap<>();
	   
		 for(Map.Entry<Integer,Integer> entry :mp.entrySet())
		 {
			 int rno=entry.getKey();
			 int marks=entry.getValue();
			 String medal;
			 if (marks >= 90) {
	                medal = "Gold";
	            } else if (marks >= 75) {
	                medal = "Silver";
	            } else if (marks >= 50) {
	                medal = "Bronze";
	            } else {
	                continue; 
	            }
			 ans.put(rno,medal);
		 }
		 return ans;
	}
   public static void main(String args[])
   {   Map<Integer,Integer> mp=new HashMap<>();
       Map<Integer,String> answer=new HashMap<>();
	   
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Welcome and how many students to enter");
	    int num=sc.nextInt();
	   for(int i=0;i<num;i++)
	   {
		   System.out.println("Enter roll no");
		   int rno=sc.nextInt();
		   System.out.println("Enter Marks");
		   int marks=sc.nextInt();
		   mp.put(rno,marks);
	   }
	   
	   Student s1=new Student();
	   answer=s1.Medals(mp);
	   System.out.println(answer);
   }
}
