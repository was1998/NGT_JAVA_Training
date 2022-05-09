package Assignment;
import java.util.Scanner;

public class A8_CheckValueINArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("please enter the value to be searched");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.println("Given value is present at index number " + i);
				temp = 1;

			}

		}
		if (temp == 0) {
			System.out.println("Given value is not present");
		}
	}

}
