package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		/* 
		 * 세금계산법 
		 * 0원이상 1000만원 이하인 경우 tax: 0.09*수익
		 * 1000만원 초과 4000만원 이하인 경우 tax: 1000*0.09 + 0.18*(수익-1000)
		 * 4000만원 초과 8000만원 미만인 경우 tax: 1000*0.09 + 3000*0.18 + 0.27*(수익-4000)
		 * 8000만원 이상인 경우 tax: 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36(수익-8000)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		int e = sc.nextInt(); //e :earning
		double tax;
		
		if(e>=0) {
			System.out.print("소득세는 ");
			if(e<=1000){
				tax = 0.09*e;
			}else if(e<=4000) {
				tax = 0.09*1000 + 0.18*(e-1000);
			}else if(e<8000) {
				tax = 0.09*1000 + 0.18*3000 + 0.27*(e-4000);
			}else {
				tax = 0.09*1000 + 0.18*3000 + 0.27*4000 + 0.36*(e-8000);
			}
			System.out.println(tax + " 입니다.");
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		
		sc.close();
	}
}
