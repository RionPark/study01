package study01.test03;

import java.util.Scanner;

public class HowOldRU {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ����̾�?");
		String age = scan.nextLine();
		System.out.println("�� " + age + "�� �̾�~");
		int num = Integer.parseInt(age);
		//���� ���̰� 10�� ���ϸ� ��̶�� ���
		//20�� ���ϸ� û�ҳ��̶�� ���
		//40�� ���ϸ� û���̶�� ���
		//41�� �̻��̸� ������ ���
		
		if(num<=10) {
			System.out.println("���");
		}else if(num<=20) {
			System.out.println("û�ҳ�");
		}else if(num<=40) {
			System.out.println("û��");
		}else if(num>=41) {
			System.out.println("����");
		}
	}
}
