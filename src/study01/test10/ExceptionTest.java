package study01.test10;

public class ExceptionTest {

	public static void main(String[] args) {

		System.out.println("시작 합니다.");
		String strNum = "1234";
		try {
			System.out.println(strNum + "을 int형으로 바꾸는 작업을 시작합니다.");
			int num = Integer.parseInt(strNum);
			System.out.println(strNum + "을 int형으로 바꾸는 작업이 끝났습니다.");
		}catch(Exception e) {
			System.out.println("장난 치나?");
			System.out.println(strNum + "은 숫자가 아닙니다.");
		}finally {
			System.out.println("난 무조건 실행되~~");
		}
		System.out.println("종료 합니다.");
	}
}
