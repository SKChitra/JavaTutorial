package sampleHello;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scan.nextLine();
		System.out.println("Your name is "+ name);
		System.out.println("Please enter age ");
		int age = scan.nextInt();
		
		System.out.println("Your age is " + age);
	}
}
