package com.javaex.practice;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {

		/*
		총급액을 입력하면 백원단위는 할인을 해주고 있습니다. 실제 지불금액을 출력하는 코드를 작성하세요
		출력 결과값:
		전체금액을 입력해주세요: 15270
		실제지불금액은 15000 입니다.
		
		전체금액을 입력해주세요: 999
		실제지불금액은 0 입니다.
		
		전체금액을 입력해주세요: 3752452
		실제지불금액은 3752000 입니다.
		*/
		
		Scanner sc = new Scanner(System.in);
        System.out.print("총급액을 입력하세요: ");
        int t = sc.nextInt();

        int d = t % 1000;
        int a = t - d;

        System.out.println("실제지불금액은 " + a + "입니다.");
		
		
		sc.close();
	}

}
