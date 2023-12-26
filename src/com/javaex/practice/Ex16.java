package com.javaex.practice;

public class Ex16 {

	public static void main(String[] args) {

		/*
		아래 프로그램의 결과를 코드작성전 에 먼저 예상해보고 코드를 작성해 확인해 보세요
		public static void main(String[] args) {
			
			int x = 1;
			int y = 1;
			
			int a = ++x *2;
			int b = y++ *2;
			
			System.out.println("a=" + a);		예상 출력 값 : a=4
			System.out.println("b=" + b);		예상 출력 값 : b=2
			System.out.println("x=" + x);		예상 출력 값 : x=2
			System.out.println("y=" + y);		예상 출력 값 : y=2
		}
		*/
		
		int x = 1;
		int y = 1;
		
		int a = ++x *2;
		int b = y++ *2;
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
	}

}
