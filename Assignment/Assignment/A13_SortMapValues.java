package Assignment;
import java.util.HashMap;
import java.util.*;

public class A13_SortMapValues {

		 public static void main(String[] args)
		    {
		 
		        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		        hmap.put("DBMS", 58);
		        hmap.put("Data minning", 70);
		        hmap.put("c language", 100);
		        hmap.put("Java", 99);
		        hmap.put("Operating System", 79);
		        hmap.put("Networking", 80);
		        Map<String, Integer> map = sortByValue(hmap);
		 
		        // print the sorted hashmap
		        for (Map.Entry<String, Integer> en : map.entrySet()) {
		            System.out.println("Key = " + en.getKey() +
		                          ", Value = " + en.getValue());
		        }
	}

		private static Map<String, Integer> sortByValue(HashMap<String, Integer> hmap) {
			  List<Map.Entry<String, Integer> > list =new LinkedList<Map.Entry<String, Integer> >(hmap.entrySet());
		        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
		            public int compare(Map.Entry<String, Integer> o1,
		                               Map.Entry<String, Integer> o2)
		            {
		                return (o1.getValue()).compareTo(o2.getValue());
		            }
		        });
		        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		        for (Map.Entry<String, Integer> aa : list) {
		            temp.put(aa.getKey(), aa.getValue());
		        }
		        return temp;
		}

}
