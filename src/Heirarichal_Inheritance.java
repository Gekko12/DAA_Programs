/*
 *                  class A        //This is called Heirarchical Inheritance whereas vice-versa is called multiple inheritance which isn't
 *                  |     |           supported in Java
 *                  |     |
 *              ----      ----
 *             |              |
 *            class B     class C
 */
class Staff{
	int staffid ,phone ,salary ;
	String name;
	
	void read(int id,int ph,int sal,String name){
		staffid = id;
		phone = ph;
		salary = sal;
		this.name = name;
	}
	
	void display() {
		System.out.println("StaffId :"+staffid+"\nPhone :"+phone+"\nSalary :"+salary+"\nName :"+name);
	}
}

class Teaching extends Staff{
	String domain ,publications;
	
	void read(int id,int ph,int sal,String name,String dom,String pub) { //Method Overriding
		super.read(id, ph, sal, name);
		domain = dom;
		publications = pub;
	}
	
	void display() {
		System.out.println("-----------Teaching----------");
		super.display();
		System.out.println("Domain :"+domain+"\nPublications :"+publications+"\n");
	}
}

class Technical extends Staff{
	String skills;
	
	void read(String skills,int id,int ph,int sal,String name) {
		super.read(id, ph, sal, name);
		this.skills = skills;
	}
	
	void display() {
		System.out.println("-----------Teachnical----------");
		super.display();
		System.out.println("Skills :"+skills+"\n");
	}
}

class Contract extends Staff{
	String period;
	
	void read(String peri,int id,int ph,int sal,String name) {
		super.read(id, ph, sal, name);
		period = peri;
	}
	
	void display() {
		System.out.println("-----------Contract----------");
		super.display();
		System.out.println("Period :"+period+"\n");
	}
}

public class Heirarichal_Inheritance {
	public static void main(String args[]) {
		Teaching te[] = new Teaching[3];
		te[0] = new Teaching(); //Constructor calls required to allocate memory
		te[1] = new Teaching();
		te[2] = new Teaching();
		te[0].read(128, 8054166, 30000, "Gaurav", "CSE", "A man who wake UP.");
		te[1].read(122, 805422, 35000, "Karuna", "ECE", "I don't want to know.");
		te[2].read(111, 9456266, 30000, "Meenakshi", "Science", "Mysterious...not a word.");
		te[0].display();
		te[1].display();
		te[2].display();
		
		Technical t[] = new Technical[3];
		t[0] = new Technical(); //Constructor calls required to allocate memory
		t[1] = new Technical();
		t[2] = new Technical();
		t[0].read("Coding",128, 8054166, 30000, "Gaurav");
		t[1].read("Aurduino",122, 805422, 35000, "Karuna");
		t[2].read("Reading",111, 9456266, 30000, "Meenakshi");
		t[0].display();
		t[1].display();
		t[2].display();
		
		Contract c[] = new Contract[3];
		c[0] = new Contract(); //Constructor calls required to allocate memory
		c[1] = new Contract();
		c[2] = new Contract();
		c[0].read("3 years", 128, 8054166, 30000, "Gaurav");
		c[1].read("5 years", 122, 805422, 35000, "Karuna");
		c[2].read("12 months", 111, 9456266, 30000, "Meenakshi");
		c[0].display();
		c[1].display();
		c[2].display();
	
	}

}
