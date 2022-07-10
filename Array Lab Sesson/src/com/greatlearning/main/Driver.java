package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.service.TransactionService;

public class Driver{
	
	public static void main(String []args) {
		
		System.out.println("Enter the Size of the Array");
		
		Scanner sc = new Scanner(System.in);
		
		int size;
		
		size = sc.nextInt();
	
		int [] array = new int[size];
		
		System.out.println("Enter the Values of an Array");
		
		for(int i=0;i<size;i++)
		
			array[i]=sc.nextInt();
		
		System.out.println("Enter the total no of targets that needs to be Acheived");
		
		int targetNo = sc.nextInt();
		
	TransactionService.checkTransaction(array, targetNo);
		
		sc.close();
	}
	
}