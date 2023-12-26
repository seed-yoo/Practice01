package com.javaex.practice;

public class Ex13 {

	public static void main(String[] args) {

		/*
		다음중 결과값이 다른 것을 선택하고 이유를 설명해 보세요 1,7번
		public static void main(String[] args) {
			
			System.out.println(13/5);					// (1)			--> 정수/정수= 정수 계산 이후 소수점 버림
			System.out.println((double)13/5);			// (2)
			System.out.println(13/(double)5);			// (3)
			System.out.println((double)13/(double)5);	// (4)
			System.out.println(13.0/5);					// (5)
			System.out.println(13/5.0);					// (6)
			System.out.println((double)(13/5));			// (7)			--> 정수/정수= 정수 계산 이후 소수점 버림 그리고 double로 강제 변환하면서 소수점 같이 출력
			
		}
		
		*/
		
		System.out.println(13/5);
		System.out.println((double)13/5);
		System.out.println(13/(double)5);
		System.out.println((double)13/(double)5);
		System.out.println(13.0/5);
		System.out.println(13/5.0);
		System.out.println((double)(13/5));
		
		
		
		
		
	}

}
