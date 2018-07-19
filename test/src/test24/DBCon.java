package test24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBCon {

	public static void main(String[] args) {
		Connection con=null;
		String url = "jdbc:mariadb://localhost:3306/oreo";
		String id = "root";
		String pwd="12345678";
		
		
		try {
			Class.forName("org.mariadb.jdbc.Driver1");
			con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement();
			String sql = "delete from user_info where uNum=1";
			int cnt = stmt.executeUpdate(sql);
			if(cnt==1) {
				System.out.println("1번이 삭제가 잘됬네요~~");
			}else {
				System.out.println("삭제 안됬다~~ 1번이라는거 없는거 같다~");
			}
			String uName = "황길동";
			sql = "insert into user_info(uName, uAge, uAddress, uEtc)";
			sql += "values('" + uName + "',33,'서울','테스트')";
			
			cnt = stmt.executeUpdate(sql);
			if(cnt==1) {
				System.out.println("등록이 잘됬네요");
			}else {
				System.out.println("등록 안된듯~");
			}
			
			sql = "update user_info set uEtc='테스트' where uNum=4";

			cnt = stmt.executeUpdate(sql);
			if(cnt==1) {
				System.out.println("수정이 잘됬네요");
			}else {
				System.out.println("수정이 안된듯~");
			}
			
			sql = "select * from user_info";
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int colSize = rsmd.getColumnCount();
			List<String> colList = new ArrayList<String>();
			for(int i=1;i<=colSize;i++) {
				colList.add(rsmd.getColumnLabel(i));
			}
			
			while(rs.next()) {
				for(String col:colList) {
					System.out.print(rs.getString(col)+",");
				}
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
