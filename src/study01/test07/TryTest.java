package study01.test07;

import java.util.Scanner;

public class TryTest {
	static Scanner scan = new Scanner(System.in);
	public static void read() {
		System.out.println("숫자를 입력하세요");
		String numStr = scan.nextLine();
		try {
			int num = Integer.parseInt(numStr);
		}catch(NumberFormatException nfe) {
			System.out.println("숫자 넣으랬지!!??");
			read();
		}
	}
	
	public static void main(String[] args) {
		read();
	}
}
