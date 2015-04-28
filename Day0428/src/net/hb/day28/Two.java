package net.hb.day28;

import java.util.Scanner;


public class Two {

	public static void main(String[] args) {
		System.out.println("Two.java");
		int age;
		age = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("나이입력?");
		age=sc.nextInt();

		
		System.out.println("나이="+age);
		System.out.println("\n 영수증출력 10:19");

		sc.close();

	}

}
