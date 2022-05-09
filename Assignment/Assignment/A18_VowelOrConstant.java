package Assignment;

public class A18_VowelOrConstant {

	public static void main(String[] args) {
		String str = "waseem is a good";
		int vowel = 0;
		int constant = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vowel++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				constant++;
			}
		}
		System.out.println("total number of vowels and constant are" + vowel + " " + constant);
	}

}
