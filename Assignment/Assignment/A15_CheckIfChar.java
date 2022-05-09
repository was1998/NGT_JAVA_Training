package Assignment;
import java.util.Scanner;

public class A15_CheckIfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the characterS");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		s=s.toLowerCase();
	    char c=s.charAt(0);
	    if(c>='a'&&c<='z') {
	    	System.out.println(c+"is a alphaabet");
	    	
	    }
	    else {
	    	System.out.println(c+" is not a alphaabet");
		}

	}

}
