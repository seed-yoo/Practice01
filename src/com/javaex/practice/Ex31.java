package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {

		/*
		상품을 구매하면 정가의 10%를 부가세로 부여한다. 아래와 같이 출력되도록 프로그램을 작성하세요
		결과 출력값 :
		상품가격: 7500
		받은돈: 10000
		=================================
		받은돈:10000.0
		상품가격: 7500.0
		부가세: 750.0
		잔액: 2500.0
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("상품가격: ");
		double a = sc.nextDouble();
		System.out.print("받은돈: ");
		double b = sc.nextDouble();
		
		double c = a/10;
		double d = b-a;
		
		System.out.println("=========================");
		System.out.println("받은돈: " + b);
		System.out.println("상품가격: " + a);
		System.out.println("부가세: " + c);
		System.out.println("잔액: " + d);
		
		
		sc.close();
		
	}

}
