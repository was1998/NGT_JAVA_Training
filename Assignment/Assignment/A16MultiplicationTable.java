package Assignment;
import java.util.Scanner;

public class A16MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("please enter the table you want to print");
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       for(int i=1;i<=10;i++) {
    	   System.out.println(num+"x"+i+"="+num*i);
       }
	}

}
