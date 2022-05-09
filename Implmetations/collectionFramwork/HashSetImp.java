package collectionFramwork;

import java.util.HashSet;

public class HashSetImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		System.out.println(set.add(6));
		System.out.println(set);
		System.out.println(set.contains(1));
	}

}
