package study01.test03;

import java.util.Scanner;

public class HowOldRU {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("너 몇살이야?");
		String age = scan.nextLine();
		System.out.println("난 " + age + "살 이야~");
		int num = Integer.parseInt(age);
		//받은 나이가 10살 이하면 어린이라고 출력
		//20살 이하면 청소년이라고 출력
		//40살 이하면 청년이라고 출력
		//41살 이상이면 꼰대라고 출력
		
		if(num<=10) {
			System.out.println("어린이");
		}else if(num<=20) {
			System.out.println("청소년");
		}else if(num<=40) {
			System.out.println("청년");
		}else if(num>=41) {
			System.out.println("꼰대");
		}
	}
}
