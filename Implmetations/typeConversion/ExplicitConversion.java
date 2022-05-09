package typeConversion;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=1666.66;
		long y=(long)x;
		int z=(int)y;
		System.out.println("Before conversion: "+x);  
		System.out.println("After conversion into long type: "+y); 
		System.out.println("After conversion into int type: "+z); 
	}

}
