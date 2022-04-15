package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int n1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int n2 = sc.nextInt();

		if(n1>=n2) {
			if(n2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}else {
			System.out.println("몫: " + n1/n2);
			System.out.println("나머지: " + n1%n2);
			}
		}else if(n1==0){
				System.out.println("0으로 나눌 수 없습니다.");
		}else {
		System.out.println("몫: " + n2/n1);
		System.out.println("나머지: " + n2%n1);
		}
		
		sc.close();
	}
}
