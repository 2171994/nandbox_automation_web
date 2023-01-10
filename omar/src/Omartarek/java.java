package Omartarek;

import java.io.IOException;
import java.util.Scanner;

public class java {

	public static void main(String[] args) throws IOException {
		
		System.out.println("The array values are: 1 , 2 , 3 , 4 ,5  ") ;
		System.out.println ("Please insert the value that you want to search for ") ;
		Scanner input = new Scanner (System.in) ; //class asmo scanner ana gaybo mn al package ale asmha java.util
		//ana ba5od opject mn al class ale asmha scanner ya3ne ro5sa mnha an al opject dh ya2dr yast3ml ay function gowa al class dh 
		int x = input.nextInt() ; //ya3ne al input ale hada5lo integer number 
		//next : is function 
	String	result = "The value you have inserted is not matched ";
	int array[] = {1 , 2 , 3 , 4 , 5};
	for (int i=0 ;i<=array.length-1 ; i++   ) {
		
		if (x==array[i])
			result ="The value you have inserted is  matched ";
	}
		
		
	System.out.println(result);
	input.close();
		

	}

}
