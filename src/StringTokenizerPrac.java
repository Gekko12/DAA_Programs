import java.util.StringTokenizer;
import java.util.Scanner;

public class StringTokenizerPrac {
	String name , date_of_birth;
	
	void read() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name :");
		name = sc.nextLine();
		
		System.out.println("Enter the date of birth using / :");
		date_of_birth = sc.next();
		
		sc.close();
	}
	
	void display() {
		String delim = "/";
		
		StringTokenizer tok = new StringTokenizer(date_of_birth,delim);
		System.out.print(name+", ");
		while(tok.hasMoreTokens()) {
			System.out.print(tok.nextToken()+".");
		}
	}
	
	public static void main(String[] args) {
		
		StringTokenizerPrac obj = new StringTokenizerPrac();
		obj.read();
		obj.display();
		
	}

}
