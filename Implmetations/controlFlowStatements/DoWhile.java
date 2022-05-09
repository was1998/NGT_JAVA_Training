package controlFlowStatements;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the number of time you want to print values:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=1;
		do {
			System.out.println(i++);
		}
		while(i<=num);
		

	}

}
