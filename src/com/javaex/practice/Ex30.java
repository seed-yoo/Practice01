package com.javaex.practice;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
		/*
		마일을 km로 변환하는 프로그램을 작성하세요.(1마일 = 1.609km 상수로 지정)
		
		결과 출력값:
		마일을 입력하세요: 10
		10.0마일은 16.09킬로미터 입니다.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("마일을 입력하세요: ");
		double m = sc.nextDouble();
		double result = m*1.609;
		
		System.out.println(m + "마일은" + result + "킬로미터 입니다.");
		
		
		
		sc.close();
		
	}

}
