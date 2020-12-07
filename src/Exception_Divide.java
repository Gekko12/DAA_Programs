import java.util.Scanner;

public class Exception_Divide {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers for division :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			int result = a/b ;
			System.out.println("(int)a/b ,Result = "+result);
		}catch(ArithmeticException e) {
			System.out.println("Exception message :"+e.getMessage());
			System.out.println("Exception caught :"+e); //Observe the difference
		}
		sc.close();
	}

}
