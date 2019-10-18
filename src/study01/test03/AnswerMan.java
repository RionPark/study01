package study01.test03;

import java.util.Random;
import java.util.Scanner;

public class AnswerMan {

	public static void main(String[] args) {
		String[] names = {"지혜영","홍철기","조용수","박도영","조은애","임혜정","김태완","김동민","박재빈","박영현","박하늘","최선호","김종서","김성국"};
		Random r = new Random();
		int rNum = r.nextInt(13)+1;
		System.out.println("이번에 대답할 자 : " + names[rNum]);
		
	}
}
