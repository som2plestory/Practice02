package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		double height; //키
		double weight; //몸무게

		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		height = sc.nextDouble();
		System.out.print("몸무게: ");
		weight = sc.nextDouble();
		
		double standard = 0.9*(height-100); //표준체중
		if (weight>standard) {
			System.out.print("과체중");
		}else if(weight==standard){
			System.out.print("표준");
		}else {
			System.out.print("저체중");
		}
		
		System.out.println(" 입니다.");
		System.out.println("표준체중: " + standard);	
		
		sc.close();
	}
}
