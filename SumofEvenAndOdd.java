package Exam;

import java.util.Scanner;

public class SumofEvenAndOdd {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter an Integer :");
		int n=sc.nextInt();
		int temp=n;
		int even=0,odd=0;
		
		while(temp!=0) {
			int rem=temp%10;
			if(rem%2==0) {
				even=even+rem;
			}else {
				odd+=rem;
			}
			temp=temp/10;
		}
		
		System.out.println("Sum of even digit :"+even);
		System.out.println("Sum of Add digit is :"+odd);
		
	}

}
