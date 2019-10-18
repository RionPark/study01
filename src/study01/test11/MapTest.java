package study01.test11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest {

	public static void main(String[] args) {
		
		List<HashMap<String,String>> people = 
				new ArrayList<HashMap<String,String>>();
		for(int i=1;i<=10;i++) {
			HashMap<String,String> human = new HashMap<String,String>();
			human.put("이름", "홍길동"+i);
			people.add(human);
		}
		System.out.println(people);
	}
}




