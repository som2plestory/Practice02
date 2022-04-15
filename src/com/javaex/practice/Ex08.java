package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		int n1 = sc.nextInt();
		System.out.print("숫자2: ");
		int n2 = sc.nextInt();
		System.out.print("숫자3: ");
		int n3 = sc.nextInt();
		
		System.out.print("가장 작은수는 ");
		if(n1>=n2){
			if(n2>=n3) {
				System.out.print(n3);
			}else {
				System.out.print(n2);
			}
		}else if(n1>=n3) {
			System.out.print(n3);
		}else {
			System.out.print(n1);
		}
		System.out.println(" 입니다.");
		
		sc.close();
	}
}
