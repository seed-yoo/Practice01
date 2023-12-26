package com.javaex.practice;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {

		/*
		Ex18 사용자로부터 화씨 온도를 입력받아 섭씨 온도로 변환하는 프로그램을 작성하세요.
		*[참고] ℃ : 섭씨 기호   ℉ : 화씨 기호
		화씨섭씨 ℃ = 5/9 * (℉ - 32)           섭씨화씨 ℉ = (℃ * 9/5) + 32
		
		출력 결과값 :
		화씨: 80
		화씨 80.0 의 섭씨온도는 26.666666666666668 입니다.
		
		화씨: 200
		화씨 200.0 의 섭씨온도는 93.333333333333334 입니다.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨: ");
		double f = sc.nextDouble();
		double c = 5*(f-32)/9;
		
		System.out.println("화씨" + f + "의 섭씨온도는" + c + "입니다.");
		
		
		
		sc.close();
		
	}

}
