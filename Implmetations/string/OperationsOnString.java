package string;

public class OperationsOnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]=new char[20];
		String str = "this is waseem";
		String str2 = "this is car";
		// print char at paticular index
		System.out.println("At index 3" + " is :" + str.charAt(3));
		//joining to strings
		System.out.println("After joining two string:"+str.concat(str2));
		//check if both string are equal
		System.out.println(str.equals(str2));
		System.out.println(String.join("-",str2,str));
		System.out.println("lenghth of string is "+str.length());
		System.out.println("substring of str"+str.substring(0,4));
		System.out.println("converting to uppercase"+str.toUpperCase());
		System.out.println("converting to lowercase "+str.toLowerCase());
		str.getChars(0, 10, arr, 0);
		for(char c:arr)
			System.out.println(c);
		

	}

}
