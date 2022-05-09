package Assignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A11_ListToArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		System.out.println("coverting list to array");
		Object[] a=list.toArray();
		for(Object obj:a) {
			System.out.println(obj);
		}
		System.out.println("converting array to list");
		List list2= Arrays.asList(a); 
		System.out.println(list2);
		

	}

}
