package test27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	private static final String url
	= "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String id 
	= "system";
	private static final String pwd 
	= "12345678";
	private static final String driver
	= "oracle.jdbc.driver.OracleDriver";
	private static Connection con;
	
	private static void open() {
		try {
			Class.forName(driver);
			DBCon.con = DriverManager.getConnection(url, id, pwd);
			con.createStatement().executeQuery("select * from member");

			System.out.println("오~ 접속 완료~! & 멤버 조회 완료");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getCon() {
		if(DBCon.con==null) {
			open();
		}
		return DBCon.con;
	}
	public static void close() {
		if(DBCon.con!=null) {
			try {
				DBCon.con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		DBCon.con = null;
	}
	
	public static void main(String[] args) {
		DBCon.getCon();
	}
}
