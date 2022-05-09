package Assignment;
import java.util.Scanner;

public class A1_PrimeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = num / 2;
		int flag = 0;
		if (num == 0 || num == 1) {
			System.out.println(num + "not a prime number");
		} else {
			for (int i = 2; i <= n; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not a prime number");
					flag = 1;
					break;
				}
			}
		}
		if (flag == 0) {
			System.out.println(num+" "+"it is a prime numn=ber" );
		}

	}

}
