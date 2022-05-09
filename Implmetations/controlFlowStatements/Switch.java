package controlFlowStatements;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		switch (num) {
		case 1: System.out.println("hello");
		break;
		case 2: System.out.println("helloworld");
		break;
		
		default:
			System.out.println("default block");
		}

	}

}
