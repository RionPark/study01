package study01.test09;

public class ObjectTest {

	int num1;
	static int num2;
	
	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest();
		ot.num2 = 10;
		ot = new ObjectTest();
		System.out.println(ot.num2);
		
		String str1 = "1";
		String str2 = new String("1");
		
		System.out.println(str1==str2);
		StringBuffer sb = new StringBuffer();
		sb.append(str2);
		System.out.println(str1.contentEquals(new StringBuffer(str2)));
	}
}
