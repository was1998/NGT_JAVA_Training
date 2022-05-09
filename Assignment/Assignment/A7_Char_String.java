package Assignment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A7_Char_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map=new HashMap<Integer,String>();
		map.put(1, "waseem");
		map.put(2, "akhtar");
		map.put(3, "mohammed");
		Set<Map.Entry<Integer,String>> set=map.entrySet();
	    ArrayList<Map.Entry<Integer, String>> list=new ArrayList<Map.Entry<Integer, String>>(set);
	    System.out.println(list);
	}

}
