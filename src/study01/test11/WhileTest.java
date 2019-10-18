package study01.test11;

import java.util.ArrayList;

public class WhileTest {
	public static void main(String[] args) {
		int i=1;
		for(;i<=10;) {
			i++;
		}
		i=1;
		while(i<=10) {
			i++;
		}
		
		ArrayList<String> strList = new ArrayList<String>();
		while(strList.size()<7) {
			strList.add("암거나~");
		}
		
		do {
			strList.add("암거나~");
		}while(strList.size()<7);
	}
}









