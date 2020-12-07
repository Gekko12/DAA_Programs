import java.util.Random;
import java.util.Scanner;

public class MergeSort {
	
	static void merge(int ary[],int low,int mid,int high) {
		int i=0 ,j=0 ,k=low;
		int n1 = mid-low+1;
		int n2 = high-mid;
		
		int[] Lary = new int[n1];
		int Rary[] = new int[n2];
		
		//Copying elements from ary[] to Leftary[] and Rightary[]
		for(int p=0;p<n1;p++)
			Lary[p] = ary[low+p];
		for(int p=0;p<n2;p++)
			Rary[p] = ary[mid+p+1];
		
		while(i<n1 && j<n2) {
			if(Lary[i] <= Rary[j]) {
				ary[k]=Lary[i];
				i++;
			}
			else {
				ary[k]=Rary[j];
				j++;
			}
			k++;
		}
		
		//Insert left-over elements to ary[]
		while(i<n1) {
			ary[k]=Lary[i];
			i++;
			k++;
		}
		while(j<n2) {
			ary[k]=Rary[j];
			j++;
			k++;
		}
	}
  
	
	static void sort(int ary[],int low,int high) {
		if(low<high) {
			int mid = (low+high)/2;
			sort(ary,low,mid);
			sort(ary,mid+1,high);
			
			merge(ary,low,mid,high);
		}
	}
  
	
	
	
	public static void main(String[] anything) {
		Scanner sc =new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		
		int ary[] = new int[n];
		System.out.print("\n\nRandom number generated for array :");
		for(int i=0;i<n;i++) {
			ary[i] = r.nextInt(100); //To generate numbers between 0-100
			System.out.print(ary[i]+" ");
		}
		
		double startTime = System.nanoTime();
		sort(ary,0,n-1);
		double stopTime = System.nanoTime();
		double elapsedTime = (stopTime-startTime)/Math.pow(10, 6); //To get time in milli-seconds
		
		System.out.printf("\n\nElapsed time for sorting : %.4f milli seconds \n",elapsedTime);//See carefully printf() is used :-)
		
		System.out.print("\n\nSorted array :");
		for(int i:ary) {
			System.out.print(i+" ");
		}
		
		sc.close();
	}

}
