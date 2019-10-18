package study01.test14;

import java.util.HashMap;

public class Execute {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("도영");
		p.setAddr("안양");
		p.setAge(20);
		p.setTrans("여");
		System.out.println(p);
		HashMap<String,String> p2 = new HashMap<String,String>();
		p2.put("name","도영");
		p2.put("addr","안양");
		p2.put("age","20");
		p2.put("trans","여");
		System.out.println(p2);
	}
}
