package com.projectone;

import java.util.Scanner;

public class ProjectOne {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student's name:");
		String name=sc.next();
		System.out.print("Enter Student's age:");
		int age=sc.nextInt();
		System.out.print("Enter Grade for Maths:");
		double maths=sc.nextDouble();
		System.out.print("Enter Grade for English:");
		double english=sc.nextDouble();
		System.out.print("Enter Grade for Science:");
		double science=sc.nextDouble();
		double average=(maths+english+science)/3;
		System.out.println("Average Grade:"+average);
		
		if(average>=91) {
			System.out.println("Grade classification: Distinction");
		}
		else if(average>=75) {
			System.out.println("Grade classification: First Class");
		}
		else if(average>=60) {
			System.out.println("Grade Classification is: Second Class");
		}
		else if(average>=33) {
			System.out.println("Grade Classification is: Pass");
		}
		else {
			System.out.println("Grade Classification is: Fail");
		}
	}

}
