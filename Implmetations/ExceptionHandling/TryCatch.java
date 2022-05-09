package ExceptionHandling;

public class TryCatch {
	public static void main(String args[]) {
		int a = 10;
		int b = 0;
		int rs;
		try {
			rs = a / b;

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("this is from finally");
		}
	}
}
