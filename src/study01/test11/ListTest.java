package study01.test11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list2.add("1");
		list2.add("2");
		list2.add("3");
		System.out.println(list1);
		System.out.println(list2);
		list1.remove(0);
		list2.remove(0);
		System.out.println(list1);
		System.out.println(list2);
		list1.set(0,"4");
		list2.set(0,"4");
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list1.size());
		System.out.println(list2.size());
	}
}


