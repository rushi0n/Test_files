package Exam;

import java.util.Scanner;

public class exception  {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age :");
		int age=sc.nextInt();
		System.out.println("Enter Weight :");
		int weight=sc.nextInt();		
		try {
			if(age>=21 && age<=60 || weight>=40 && weight<=70) {
				System.out.println("Valid Donar");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	

}
