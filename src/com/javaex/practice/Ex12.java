package com.javaex.practice;

public class Ex12 {

	public static void main(String[] args) {
		
		/*
		다음코드의 잘못된 부분을 찾아서 수정해 보세요.
		(코드를 작성해서 오류가 없도록 변경해 보세요.)
		
		public static void main(String[] args) {
			
			int x, y = 0;				// x와 y를 모두 0으로 초기화
			
			char grade = "A";			// 문자 A를 grade에 대입
			
			int salary = 2,000,000;		// salary 2,000,000을 대입
			
			byte n = 1000;				// n에 1000을 대입
		}
		
		수정 :
		public static void main(String[] args) {
		
			int x= 0;
			int y= 0;
			
			char grade = 'A';
			
			int salary = 2000000;
			String salary2 = "2,000,000";
			
			int n = 1000;
		}
		*/
		
		
		int x= 0;
		int y= 0;
		
		char grade = 'A';
		
		int salary = 2000000;
		String salary2 = "2,000,000";
		
		int n = 1000;
		
		System.out.println(x + " " + y + " " + grade + " " + salary + " " + salary2 + " " + n);
		
		
		
	}
}
