package collectionFramwork;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListImp {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(11);
		list.add(10);
		list.add(7);
		System.out.println("Secoend element in the list is" + list.get(1));
		list.add(1, 13);
		System.out.println("third element in the list is" + list.get(2));
		list.set(1, 14);
		System.out.println("after updating element in the list is" + list.get(1));
		ListIterator<Integer> itr=list.listIterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		System.out.println("size of list is"+list.size());

	}

}
