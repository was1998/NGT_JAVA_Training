package Assignment;

public class A14_IsLeapYera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2000;
		if(year%400==0||year%4==0&&year%100!=0) {
			System.out.println("it is a leap year");
			
		}
		else
		{
			System.out.println("it is not a leap yearS");
		}

	}

}
