package net.hb.day28;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		System.out.println("First.java");
		int age=23;
		String name ="ȫ�浿";
		String addr ="��û";
		
		System.out.println(name +"���� ���̴� " +age+"���Դϴ�.");
		System.out.println(name +"���� �ּҴ� " +addr+"�Դϴ�");

		System.out.println("\n ������ ��� 10:03");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�?");
		age = sc.nextInt();
		System.out.println(age);
	}

}
