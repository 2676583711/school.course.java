package cn.zhou;

import java.util.Scanner;

public class MathMethod {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("please input a number:");
		num = s.nextInt();

		System.out.println(num % 2 == 0 ? num + "是偶数" : num + "是奇数");
	}
}
