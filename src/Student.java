import java.util.Scanner;
public class Student {
	String USN , name , programme , phone ;
	
	void create(String usn,String name,String prog,String ph) {
		USN = usn;
		this.name = name;
		programme = prog;
		phone = ph;
	}
	
	void print() {
		System.out.println("USN: "+USN+"\nName: "+name+"\nProgramme: "+programme+"\nPhone: "+phone);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter number of Students :");
		
        int n = sc.nextInt();
        
    	String usn , na , pro , pho ;
        Student obj[] = new Student[n]; //It's not a constructor , but array of objects declaration
        // Only memory for obj[n] is declared contains null value
        for(int i=0;i<n;i++) {
        	obj[i] = new Student(); //Now obj[i] is pointing to an actual object
            System.out.println("Enter USN, Name, Programme, Phone :-");
        	usn = sc.next();
        	na = sc.next();
        	pro = sc.next();
        	pho = sc.next();
        	obj[i].create(usn, na, pro, pho);
        	}
        
        for(int i=0;i<n;i++) {
        	System.out.println("Detail for student "+(i+1)+" :");
        	obj[i].print();
        }
        sc.close();
	}

}
