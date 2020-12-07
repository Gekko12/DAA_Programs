import java.util.Scanner;
public class StackImplement {
    String[] stack;
    int top;
    
    StackImplement(int size){
    	stack = new String[size];
    	top = -1;
    }
    
    void push(String str) {
    	if(top == stack.length-1)
    		System.out.println("Overflow.......");
    	else
    	    stack[++top] = str;
    }
    
    String pop() {
    	if(top == -1) {
    		return "\nUnderflow..........";
    	}
    	return stack[top--];
    }
    
    void display() {
    	int temp = top;
    	for(int i=temp;i>-1;i--)
    		System.out.println("|____"+stack[i]+"____|");
    	System.out.println(" ");
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Stack :");
		int n = sc.nextInt();
		int choice ;
		StackImplement obj = new StackImplement(n);
		
		do {
			System.out.println("\n------------------------Menu-----------------------\n");
			System.out.println("1.Push \n2.Pop \n3.Display \n4.Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:System.out.println("Enter the element :");
			       String ele = sc.next();
			       obj.push(ele);
			       break;
			case 2:System.out.println("Popped element is --> "+obj.pop());
			       break;
			case 3:System.out.println("Stack :- \n");
			       obj.display();
			       break;
			default :System.out.println("Aborting !!!!!!!!!!!!!!!");  
			}
			}while(choice!=4 && choice<4 );
		
		sc.close();
	}

}
