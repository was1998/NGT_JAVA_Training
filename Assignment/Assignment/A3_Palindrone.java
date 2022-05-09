package Assignment;
import java.util.Scanner;

public class A3_Palindrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Enter the string");
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int len=s.length();
    int temp=0;
    for(int i=0,j=len-1;i<len;i++,j--) {
     if(s.charAt(i)!=s.charAt(j)) {
    	 System.out.println("Not a palindrome");
    	 temp=1;
    	 break;
    	 
     }
    }
    if(temp==0)
    System.out.println("it is palindrome");
    
	}

}
