package com.javaex.practice;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {

		/*
		사용자에게 연필의 개수와 인원수를 입력받아 모든인원에게 같은수의 연필을 나눠주려고 한다
		1인당 연필의 받을수 있는 연필의 개수와 나머지를 구하시오
		결과 출력값 : 
		전체 연필갯수를 입력해주세요: 127
		전체 인원수를 입력해주세요: 3
		1인당 연필의 갯수는 42 입니다.
		연필의 나머지 갯수는 1입니다.
		
		전체 연필갯수를 입력해주세요: 45
		전체 인원수를 입력해주세요: 5
		1인당 연필의 갯수는 9 입니다.
		연필의 나머지 갯수는 0입니다.
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("전체 연필갯수를 입력해주세요: ");
		int n = sc.nextInt();
		System.out.print("전체 인원수를 입력해주세요: ");
		int h = sc.nextInt();
		
		int a = n/h;
		int b = n%h;
		
		System.out.println("1인당 연필의 갯수는" + a + "입니다.");
		System.out.println("연필의 나머지 갯수는" + b + "입니다.");
		
		
		
		
		sc.close();
		
		
		
	}

}
