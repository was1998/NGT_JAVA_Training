package Assignment;
import java.util.ArrayList;
import java.util.List;

public class A10_JoinTwoList {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		List<Integer> list3=new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list2.add(50);
		list2.add(60);
		list2.add(70);
		list2.add(80);
		list3.addAll(list1);
		list3.addAll(list2);
		System.out.println("Total element in the new list are :");
		for(int value:list3) 
		{
			System.out.println(value);
		}
		

	}

}
