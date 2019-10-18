package study01.test12;

class Father{
	public Father() {
		System.out.println("난 아빠 생성자");
	}
}
public class Test extends Father {
	
	public Test() {
		System.out.println("난 테스트 생성자");
	}
	
	public void a() {
		System.out.println("난 테스트!!!!!!의 에이 아빠의 에이 아님!!");
	}
	
	public static void main(String[] args) {
		Father t = new Test();
		((Test)t).a();
	}
}
