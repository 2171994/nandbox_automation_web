package Omartarek;

//import java.util.Scanner;

public class max_num_in_array {

	public static void main(String[] args) {

		System.out.println("Please enter the number : ");
		//Scanner input = new Scanner (System.in);
		//	int x = input.nextInt();
		int arr[] = {1 ,2 , 15 , 8 , 12};
		int max = arr[1];
		for (int i = 0 ; i<arr.length ; i++) {
		
			if (max < arr[i]) {
				max =arr[i];
			}
			
			
		}
		System.out.println("the max number in the array is "+ max);
	}

}
