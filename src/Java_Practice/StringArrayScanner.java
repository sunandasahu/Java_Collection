package Java_Practice;

import java.util.Scanner;

public class StringArrayScanner {

	public static void main(String[] args) {
		String[] car = new String[5];	
		Scanner myObj = new Scanner(System.in);
		for(int i=1; i<=5;i++) {
			System.out.println("Please enter a car name");
			String value = myObj.nextLine();
			car[i-1] = value;
			
		}
		System.out.println(car[3]);	
		System.out.println(car[4]);	
		}

	}


