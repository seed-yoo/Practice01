package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {

		/*
		동전별 개수를 입력받아 총금액을 계산하는 프로그램을 작성하세요.
		결과 출력값 :
		500원 개수 : 1
		100원 개수 : 1
		50원 개수 : 1
		10원 개수 : 1
		동전의 총합은 660 원 입니다.
		
		500원 개수 : 3
		100원 개수 : 5
		50원 개수 : 4
		10원 개수 : 3
		동전의 총합은 2230 원 입니다.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수 : ");
		int a = sc.nextInt();
		System.out.print("100원 개수 : ");
		int b = sc.nextInt();
		System.out.print("50원 개수 : ");
		int c = sc.nextInt();
		System.out.print("10원 개수 : ");
		int d = sc.nextInt();
		int result = a*500 + b*100 + c*50 + d*10;
		System.out.println("동전의 총합은 " + result + "원 입니다.");
		
		
		
		sc.close();
	}

}
