package ohpotato;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	
	public void lotto1() {
	Scanner sc = new Scanner(System.in);
	
	Random random = new Random();
	
	int arr[] = new int[6];
	
	for(int i = 0; i < arr.length; i++) {
		arr[i] = random.nextInt(45)+1;	
		
		for (int j = 0; j < i; j++) {	
			if (arr[i] == arr[j]) {
				i--;	 
				
			}
		}
	}
		Arrays.sort(arr);	
		
	for(int i = 0; i < arr.length; i++) 
		System.out.print(arr[i] + " ");	
}
}








