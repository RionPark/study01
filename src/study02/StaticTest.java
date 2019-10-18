package study02;

public class StaticTest {
	final static int a;
	static {
		a = 10;
		System.out.println("아 나 된다고~");
	}
	public static void main(String[] args) {
		System.out.println(StaticTest.a);
	}
}
