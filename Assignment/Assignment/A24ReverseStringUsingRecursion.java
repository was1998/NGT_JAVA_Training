package Assignment;

public class A24ReverseStringUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "this is";
		String result = reverse(str);
		System.out.println("The reversed sentence is: " + result);
	}

	public static String reverse(String string) {
		if (string.isEmpty())
			return string;

		return reverse(string.substring(1)) + string.charAt(0);
	}

}
