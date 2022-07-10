package com.greatlearning.service;

import java.util.Scanner;

public class TransactionService{
	
	public static void checkTransaction(int[]array,int targetNo) {
	
		Scanner sc = new Scanner(System.in);

		while (targetNo-- != 0) {

			int flag = 0;
			int target;
			
		System.out.println("enter the value of target");
		
		target = sc.nextInt();
		
		int sum=0;
		
		for(int i=0;i<array.length;i++) {
			
			sum+=array[i];
			
			if(sum>=target) {
				
				System.out.println("Target Acheived after " +(i+1)+ " Transactions");
				
				flag = 1;
				break;
				}
			}
		if(flag==0) {
			System.out.println("Given Target is not Acheived");
			}
		}
		sc.close();
	}
}