package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {

		/*
		직사각형의 둘레와 면적을 구하는 프로그램을 작성하세요.(가로 세로 변수 double형으로 작성)
		결과 출력값:
		가로를 입력하세요 : 3
		세로를 입력하세요 : 4
		사각형의 넓이는 12.0
		사각형의 둘레는 14.0
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로를 입력하세요: ");
		double width = sc.nextDouble();
		System.out.println("세로를 입력하세요: ");
		double height = sc.nextDouble();
		
		double a = width * height;
		double p = 2*width + 2*height;
		
		System.out.println("사각형의 넓이는 " + a);
		System.out.println("사각형의 둘레는 " + p);
		
		sc.close();
		
		
		
		
		
		
	}

}
