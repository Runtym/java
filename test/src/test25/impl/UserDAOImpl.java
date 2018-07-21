package test25.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import test25.UserDAO;

public class UserDAOImpl implements UserDAO {

	private Connection con;
	public UserDAOImpl(Connection con) {
		this.con = con;
	}
	@Override
	public ArrayList<HashMap<String, String>> selectUserList() {
		ArrayList<HashMap<String, String>> al = 
				new ArrayList<HashMap<String, String>>();
		String sql = "select uiName, uiNum1, uiAge, uiEtc from user_info";
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			ResultSet  rs = ps.executeQuery();
			while(rs.next()) {
				HashMap<String, String> hs = new HashMap<String, String>();
				hs.put("uiName", rs.getString("uiName"));
				hs.put("uiNum", rs.getString("uiNum"));
				hs.put("uiAge", rs.getString("uiAge"));
				hs.put("uiEtc", rs.getString("uiEtc"));
				al.add(hs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
	}

}
