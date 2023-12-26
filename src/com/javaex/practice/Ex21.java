package com.javaex.practice;

public class Ex21 {

	public static void main(String[] args) {

		/*
		아래의 출력결과를 예상하여 작성하세요. Ex20문제와 어느 부분이 다른지 비교해 보세요.
		(코드를 작성해서 예상과 맞는지 확인해 보세요.) 

		public static void main(String[] args) {
			
			int i = 10;
			int n = ++i %2;
			
			System.out.println(i);		--> 예상 출력 값 : 11
			System.out.println(n);		--> 예상 출력 값 : 1
		}
		
		Ex20과 다른점은 int n의 값에서 ++i 와 i++이다.
		*/
		
		int i = 10;
		int n = ++i %2;
		
		System.out.println(i);
		System.out.println(n);
	
		
		
		
	}

}
