package com.javaex.practice;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {

		/*
		월급을 입력받아 10년동안 최대 저축액을 계산하는 프로그램을 작성하세요. 
		
		출력값 :
			월급을 입력하세요: 200
			10년동안 최대 저축액은 24000원 입니다.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월급을 입력하세요: ");
		int salary = sc.nextInt();
		
		int result = salary * 120;
		System.out.println("10년동안 최대 저축액은 " + result + "원 입니다.");
		
		sc.close();
		
		
	}

}
