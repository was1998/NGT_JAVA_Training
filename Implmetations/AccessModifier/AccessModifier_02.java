package AccessModifier;

public class AccessModifier_02 {

	public static void main(String[] args) {
		AccessModifier am=new AccessModifier();
		System.out.println("accessing public member"+am.i);
		System.out.println("accessing default member"+am.y);
		System.out.println("accessing protected member"+am.z);
		//System.out.println("accessing private member"+am.x); cannot access private memeber
		
		
	}

}
