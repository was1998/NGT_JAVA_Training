package Assignment;

public class A4_AverageOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,6,4,5,7,6,8};
		int len=arr.length;
		int sum=0;
		int result=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		result=sum/len;
		System.out.println("the average is:"+result);

	}

}
