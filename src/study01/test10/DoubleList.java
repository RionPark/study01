package study01.test10;

import java.util.ArrayList;
import java.util.Random;

public class DoubleList {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		ArrayList<Double> doubleList = new ArrayList<Double>();
		Random r = new Random();
		for(int i=0;i<10;i++) {
			strList.add(r.nextInt(100) + "." + r.nextInt(10));
			doubleList.add(Double.parseDouble(strList.get(i)));
		}
		for(int i=0;i<doubleList.size();i++) {
			for(int j=i+1;j<doubleList.size();j++) {
				if(doubleList.get(i)>doubleList.get(j)) {
					double tmpDouble = doubleList.get(i);
					doubleList.set(i, doubleList.get(j));
					doubleList.set(j, tmpDouble);
				}
			}
		}
		System.out.println(doubleList);
		System.out.println(doubleList.get(0) + doubleList.get(1));
		
	}
}
