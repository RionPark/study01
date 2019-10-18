package study01.test14;

class Son extends AbstractTest{

	@Override
	public void test() {
		System.out.println("test");
	}
	
}
public abstract class AbstractTest {

	public abstract void test();

	public static void main(String[] args) {
		AbstractTest at = new Son();
		at.test();
	}
}
