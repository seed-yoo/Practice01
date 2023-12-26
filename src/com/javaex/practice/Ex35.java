package com.javaex.practice;

public class Ex35 {

	public static void main(String[] args) {
		
		/*
		long형 변수를 사용하여 빛이 1년동안 진행하는 거리를 계산하여 출력하세요.
		(단 빛의 속도는 300000 km/s 로 계산한다)
		결과 출력값 : 
		빛이 1년동안 가는 거리는 9640800000000 km 입니다.
		*/
		long result = 300000l * 365 * 24 * 60 * 60;
		
		
		System.out.println("빛이 1년동안 가는 거리는 " + result + "km 입니다.");
		
		
	}
}
