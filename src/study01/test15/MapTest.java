package study01.test15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		for(int i=1;i<=10;i++) {
			map.put(i, "나나" + i);
		}
		
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println("key : " + key + ", value : " + map.get(key));
		}
	}
}
