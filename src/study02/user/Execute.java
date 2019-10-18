package study02.user;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Execute {
	Connection con = DBCon.getCon();
	Scanner scan = new Scanner(System.in);
	
	void insert() {
		System.out.println("id를 입력해주세요.");
		String id = "'" + scan.nextLine() + "'";
		System.out.println("pwd를 입력해주세요.");
		String pwd = "'" + scan.nextLine() + "'";
		System.out.println("name를 입력해주세요.");
		String name = "'" + scan.nextLine() + "'";
		System.out.println("age를 입력해주세요.");
		String age = "'" + scan.nextLine() + "'";
		System.out.println("etc를 입력해주세요.");
		String etc = "'" + scan.nextLine() + "'";
		String sql = "insert into user_info(id,pwd,name,age,etc) ";
		sql += " values(" + id + "," + pwd + "," + name + "," + age + "," + etc +")";
		
		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("입력된 갯수 : " + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	void update() {
		System.out.println("업데이트 할 id를 입력해주세요.");
		String id = "'" + scan.nextLine() + "'";
		System.out.println("해당 id의 변경할 이름값을 입력해주세요.");
		String name = "'" + scan.nextLine() + "'";
		System.out.println("해당 id의 변경할 나이 입력해주세요.");
		String age = "'" + scan.nextLine() + "'";
		String sql = " update user_info set name=" + name + ","
				+ " age =" + age + " where id = " + id;

		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("업데이트 갯수 : " + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	void delete() {
	}
	void select() {
	}
	public static void main(String[] args) {
		Execute e = new Execute();
		System.out.println("원하는 서비스 번호를 입력하세요.");
		System.out.println("1. 유저 생성");
		System.out.println("2. 유저 삭제");
		System.out.println("3. 유저 수정");
		System.out.println("4. 유저 조회");
		System.out.println("q. 종료");
		String orderNum = e.scan.nextLine();
		if(orderNum.equals("q")) {
			System.out.println("종료");
		}else {
			e.insert();
		}
	}
}
