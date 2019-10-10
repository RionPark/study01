package study01.test11;

interface Promise{
	public int test();
	void test1();
}

public class InterfaceTest implements Promise{
	public int test() {
		return 1;
	}
	public void test(int a) {
		
	}

	public void test1() {
		
	}
	
	public String toString() {
		return "메모리 주소 싫어!!";
	}
	public static void main(String[] args) {
		System.out.println(new InterfaceTest());
		System.out.println(new String("abc"));
	}
}







