package study01.test03;

import java.util.Random;
import java.util.Scanner;

public class AnswerMan {

	public static void main(String[] args) {
		Random r = new Random();
		System.out.println("이번에 대답할 자 : " + (r.nextInt(15)+1));
		
	}
}
