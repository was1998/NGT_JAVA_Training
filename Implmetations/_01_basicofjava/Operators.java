package _01_basicofjava;

public class Operators {

	public static void main(String[] args) {
		int i=1;
		int a=2;
		int b=6;
		System.out.println(i++ +" "+ ++i);
		System.out.println(i-- +" "+ --i);
		System.out.println(~i);//0001-->0010
		System.out.println(a*b);
		System.out.println(b%a);
		System.out.println(b/a);
		System.out.println(a+b);
		System.out.println(b-a);
	    System.out.println(b>>2);
		System.out.println(b<<2);//011000
		System.out.println(a&b);//0010 0110-->0010
		System.out.println(a|b);//0010 0110-->0110
		System.out.println(a^b);//0010 0110->0100
	}

}
