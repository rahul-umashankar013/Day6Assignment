package methodreference;
import java.util.*;
public class Third {
	public static Map<String, String> mp = new HashMap<>();

    static {
        mp.put("Admin", "1234");
    }
	
    public static boolean authenticate(String username, String password) {
        return mp.containsKey(username) && mp.get(username).equals(password);
    }
	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Username: ");
	        String X = sc.next();
	        System.out.println("Enter Password: ");
	        String Y = sc.next();

	        
	        I3 obj = Third::authenticate;

	        if (obj.check(X, Y)) {
	            System.out.print("Authenticated");
	        } else {
	            System.out.print("Failed");
	        }
	    }
}
