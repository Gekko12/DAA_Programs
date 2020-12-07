import java.util.Scanner;
import java.util.Random;


public class Quick_Sort {
	
	public static int parti(int ary[],int low,int high) {
		int pivot = ary[high] , temp;
		int i = low-1 ,j ;
		
		for(j=low;j<high;j++) {
			if(ary[j] < pivot) {
				i++;
				temp = ary[i];
				ary[i] = ary[j];
				ary[j] = temp;
			}
		}
		temp = ary[i+1];
		ary[i+1] = ary[j];
		ary[j] = temp;
		
		return (i+1);
	}
	
	public static void quick(int ary[],int start,int end) {
		if(start < end) {
			int s = parti(ary,start,end);
			quick(ary,start,s-1);
			quick(ary,s+1,end);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Enter the size of array :");
		int n = sc.nextInt();
		
		int[] ary = new int[n];
		for(int i=0;i<n;i++) {
			ary[i] = r.nextInt(20);
		}
		
		System.out.print("\nArray of length "+n+" generated (randomly): ");
		for(int i:ary)
			System.out.print(i+" ");
		
		double startTime = System.nanoTime(); //New concept 
		quick(ary,0,n-1);
		double stopTime = System.nanoTime();
		
		double elapsedTime = (stopTime - startTime)/Math.pow(10, 6);
		
		System.out.println("\n\nTime taken to sort array is :"+elapsedTime+" milli seconds.");
		System.out.print("\n\nSorted array : ");
		for(int i:ary)
			System.out.print(i+" ");
		
		sc.close();
		
	}

}
