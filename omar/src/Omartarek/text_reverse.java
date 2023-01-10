package Omartarek;

import java.util.Scanner;

public class text_reverse {

	public static void main(String[] args) {
		System.out.println("please enter the text that you want to reverse");
		Scanner input = new Scanner (System.in);
		String txt = input.next();
		for (int i=txt.length()-1 ;i>=0 ;i--) {
			System.out.print(txt.charAt(i));
			
		}
		input.close();

	}

}
