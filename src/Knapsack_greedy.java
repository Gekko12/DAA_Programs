import java.util.Scanner;

public class Knapsack_greedy {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of items :");
		int n = sc.nextInt();
		int[] p = new int[n];
		int[] w = new int[n];
		
		System.out.println("Enter the profit for "+n+" items :");
		for(int i=0;i<n;i++)
			p[i] = sc.nextInt();
		
		System.out.println("Enter the weight for "+n+" items :");
		for(int i=0;i<n;i++)
			w[i] = sc.nextInt();
		
		System.out.println("Enter the maximum capacity of knapsack :");
		int m = sc.nextInt();
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				double r1 = 1F*p[i]/w[i]; //Ratios
				double r2 = 1f*p[j]/w[j];
				if(r2 > r1) {
					int tp = p[i]; //Temporary storage
					int wp = w[i];
					p[i] = p[j];
					w[i] = w[j];
					p[j] = tp;
					w[j] = wp;
				}
			}
		}
		
		System.out.println("\nProfit / Weight ratio in ascending order -");
		System.out.print("Profit : ");
		for(int i:p)
			System.out.print(i+" ");
		
		System.out.print("\nWeight : ");
		for(int i:w)
			System.out.print(i+" ");
		
		System.out.println("\n\n");
		int i=0 ,j=0;
		double total_profit = 0.0;
		
		while(i < n) {
			if(w[i] < m) {
				total_profit += p[i];
				m -= w[i];
				System.out.println("Item "+(++j)+" of wieght "+w[i]+" added and profit of "+p[i]+" added.");
				i++;
			}
			else 
				break; //As weight of item exceeded...
		}
		
		if(i < n) { //To obtain the maximum profit ratio also added 
			total_profit += ((1F*m)/w[i]) *p[i];
			System.out.println("Item "+(++j)+" of wieght "+w[i]+" added and profit of "+((1F*m)/w[i]) *p[i]+" added.");
		}
		
		System.out.printf("\n\nTotal profit = %.3f ",total_profit);
		sc.close();
	}

}
