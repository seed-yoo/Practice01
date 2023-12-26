package com.javaex.practice;

public class Ex18 {

	public static void main(String[] args) {

		/*
		다음의 코드를 컴파일 할 때 오류가 발생한다. 오류의 원인은? 
		public static void main(String[] args) {
			
			int x;
			
			System.out.println(x);
		}
		
		답 : 변수의 값을 추가하지 않았다.
		*/
		
		int x;
		
		x= 10;
		
		System.out.println(x);
		
	}

}
