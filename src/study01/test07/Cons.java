package study01.test07;

public class Cons {
	int num=5;
	public Cons() {
		System.out.println(num);
		System.out.println("아 내가 호출되었구나!");
	}
	public Cons(int num) {
		System.out.println("아 num파라메터가 있는 날 호출하였구나~");
	}
	public static void main(String[] args) {
		Cons c = new Cons();
		System.out.println(c.num);
	}
}
