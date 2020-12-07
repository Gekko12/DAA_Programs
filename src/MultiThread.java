import java.util.Random;

class Third implements Runnable{  //Runnable is an interface
	int x;
	Third(int x){
		this.x = x;
	}
	public void run() {
		System.out.println("Third thread ,Cube = "+(x*x*x));
	}
}

class Second implements Runnable{
	int x;
	Second(int x){
		this.x = x*x;
	}
	public void run() {
		System.out.println("Second thread ,Square = "+x);
	}
}

class First extends Thread{ //To operate using Multithread class ,we have to extend it
	public void run() {
		try {
				int num=0;
				
				Random r = new Random();
				Thread t2 ,t3 ;
				
				for(int i=0;i<5;i++) {
					num = r.nextInt(100); //It will generate a random number b/w 0-100
					System.out.println("\nFirst thread ,Number generated = "+num);
					
					t2 = new Thread(new Second(num));
					t2.start();
					
					t3 = new Thread(new Third(num));
					t3.start();
					
					Thread.sleep(1000); //sleep for 1 sec
				}
		}catch(InterruptedException e) {
			System.out.println("Exception caught :"+e);
		}
	}
}

public class MultiThread {
	public static void main(String[] args) {
		First fir = new First();
		fir.start();
	}

}
