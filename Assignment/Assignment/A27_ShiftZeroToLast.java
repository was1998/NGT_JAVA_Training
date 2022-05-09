package Assignment;

public class A27_ShiftZeroToLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 10, 8, 0, 2, 0, 3 };
		int a[] = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				a[count++] = arr[i];
			}
		}
		while (count < arr.length) {
			a[count++] = 0;
		}
		for (int value : a) {
			System.out.println(value);
		}
	}

}
