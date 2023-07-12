package secondmaximum;

import java.util.Scanner;

public class SecondMaximum {

	public static int secMax(int array[],int size,int max,int secmax) {
		for(int i=0;i<size;i++) {
			if(array[i]>max) {
				secmax = max;
				max = array[i];
			}
			else if(array[i]>secmax && array[i]!=max) {
				secmax = array[i];
			}
		}
		return secmax;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int [n];
		int max = Integer.MIN_VALUE;
		int secmax = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
		}
		int results = secMax(array,n,max,secmax);
		System.out.println(results);
	}

}
