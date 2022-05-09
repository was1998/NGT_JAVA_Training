package Assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A25_ListAndArray {
public static void main(String args[]) {
	List<Object> list=new ArrayList<Object>();
	
	list.add(10);
	list.add(20);
	list.add(30);
	Object[] arr=new Object[list.size()];
	System.out.println("coverting List to Array");
	arr=list.toArray();
	System.out.println(arr);
	System.out.println("coverting array to List");
	Collections.addAll(list,arr);
	System.out.println(list);
	
	
}

}
