package study01.test05;

import study01.test04.PrivateTest;

class Test{
	int num;
}

public class PublicTest {
	public int num;
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.num);
	}
}
