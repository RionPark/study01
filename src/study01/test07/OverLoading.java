package study01.test07;

public class OverLoading {
	public void test() {
		System.out.println("test()메소드 호출!");
	}
	public void test(int num) {
		System.out.println("test(int num)메소드 호출!");
	}
	public void test(String str) {
		System.out.println("test(String str) method call!");
	}
	public void test(String str,int num) {
		System.out.println("test(String str,int num) method call!");
	}
	public void test(int num,String str) {
		System.out.println("test(int num,String str) method call!");
	}

	public void test(double d) {
		System.out.println("test(double d) method call!");
	}
	public int test1() {
		return 0;
	}
	public static void main(String[] args) {
		OverLoading ol = new OverLoading();
		ol.test(1.1);
	}
}




