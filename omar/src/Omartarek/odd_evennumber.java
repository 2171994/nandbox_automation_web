package Omartarek;

import java.util.Scanner;

public class odd_evennumber {

	public static void main(String[] args) {
		
		System.out.println("please insert the number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num%2==0) {
			System.out.println("the number that you already inserted is even");
		}
		else {
			System.out.println("the number that you already inserted is odd");

		}
		input.close();
		

	}

}
