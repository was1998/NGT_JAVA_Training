package Assignment;

public class A29_FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String str ="waseem";

        for(char i :str.toCharArray()){
        if ( str.indexOf(i) == str.lastIndexOf(i)) {
            System.out.println("First non-repeating character is: "+i);
            break;
        }
        }

	}

}
