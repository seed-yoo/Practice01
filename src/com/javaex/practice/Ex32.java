package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {

		/*
		사용자로부터 가로 세로 값을 입력받아 삼각형의 넓이를 구하는 프로그램을 작성하세요
		결과 출력값:
		가로: 5
		세로: 10
		삼각형의 넓이는 25.0 입니다.
		
		가로: 12.5
		세로: 20
		삼각형의 넓이는 125.0 입니다.
		
		가로: 22.5
		세로: 56.4
		삼각형의 넓이는 634.5 입니다.
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("가로: ");
		double width = sc.nextDouble();
		System.out.print("세로: ");
		double height = sc.nextDouble();
		
		double result = width * height / 2;
		System.out.println("삼각형의 넓이는 " + result);
		
		
		sc.close();
		
		
	}

}
