package Assignment;

public class A6_ArrayConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int arr1[]= {6,7,8,9,1};
		
		int size=arr.length+arr1.length;
		int c[]=new int[size];
		for(int i=0;i<size;i++) {
			if(i<arr.length) {
				c[i]=arr[i];
			}
			if(i>=arr.length) {
				c[i]=arr1[i-arr.length];
			}
		}
		for(int a:c) {
			System.out.print(a+" ");
		}

	}

}
