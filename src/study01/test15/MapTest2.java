package study01.test15;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		Map<String,String> map = new LinkedHashMap<String,String>();
		map.put("좋아하는음료수1", "커피");
		map.put("좋아하는음료수2", "맥주");
		map.put("좋아하는음료수3", "진로이즈백");
		map.put("테스트2", "123132");
		map.put("테스트1", "123132");
		map.put("테스트4", "123132");
		map.put("테스트3", "123132");
		map.put("테스트5", "123132");
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key : " + key + ", value : " + map.get(key));
		}
	}
}
