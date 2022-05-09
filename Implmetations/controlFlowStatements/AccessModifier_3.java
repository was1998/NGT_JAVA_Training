package controlFlowStatements;

import AccessModifier.AccessModifier;

public class AccessModifier_3 extends AccessModifier {

	public static void main(String[] args) {

		AccessModifier_3 am = new AccessModifier_3();
		System.out.println("accessing protected member from subclass" + am.z);
	}

}
