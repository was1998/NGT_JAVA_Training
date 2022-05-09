package ExceptionHandling;

import java.io.IOException;

class demo {
	void method() throws IOException {
		throw new IOException("device error");
	}
}

class Throws_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			demo m = new demo();
			m.method();
		} catch (Exception e) {
			System.out.println("exception handled");
		}

		System.out.println("normal flow...");
	}

}
