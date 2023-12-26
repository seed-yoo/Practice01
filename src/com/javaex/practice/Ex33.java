package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {

		/*
		사용자로부터 구의 반지름을 입력받아 구의 부피를 계산하는 프로그램을 작성하세요.
		구의 부피를 구하는 공식
		V=4/3*PI*r*r*r
		(V:구의부피, PI:3.14, r:반지름)
		결과 출력값 :
		반지름: 5
		구의부피는: 523.3333333333334 입니다.
		
		반지름: 12
		구의부피는: 7234.5599999999995 입니다.
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름: ");
		double r = sc.nextDouble();
		double PI = 3.14;
		double V = (4*PI*r*r*r)/3;
		
		System.out.println("구의부피는 : " + V + "입니다.");
		
		
		
		
		sc.close();
	}

}
