package Assignment;

public class A22_FrequencyOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "waseem taw";
		char arr[] = str.toCharArray();
		int a[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0&&arr[i]!=' ') {
				a[i] = 1;
			} else
				continue;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					
					a[i]++;
					arr[j] = 0;

				}
			}
		}
		System.out.println("Alphabet"+"      "+"Occurence");
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0) {
			System.out.println("   "+arr[i]+"                 "+a[i]);
		}}

	}

}
