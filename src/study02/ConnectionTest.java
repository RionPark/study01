package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectionTest {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "bdi";
		String pwd = "12345678";
		String sql = "select * from user_info";
		List<Map<String,String>> userList 
		= new ArrayList<Map<String,String>>();
		int a = 3;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,id,pwd);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Map<String,String> userMap = new HashMap<String,String>();
				userMap.put("id", rs.getString("id"));
				userMap.put("name", rs.getString("name"));
				userMap.put("age", rs.getString("age"));
				userMap.put("etc", rs.getString("etc"));
				userMap.put("pwd", rs.getString("pwd"));
				userList.add(userMap);
			}
			
			for(Map<String,String> user:userList) {
				System.out.println(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}














