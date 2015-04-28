package net.hb.day28;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		System.out.println("First.java");
		int age=23;
		String name ="홍길동";
		String addr ="시청";
		
		System.out.println(name +"님의 나이는 " +age+"세입니다.");
		System.out.println(name +"님의 주소는 " +addr+"입니다");

		System.out.println("\n 영수증 출력 10:03");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이입력?");
		age = sc.nextInt();
		System.out.println(age);
	}

}
