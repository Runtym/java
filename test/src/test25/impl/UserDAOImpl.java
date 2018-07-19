package test25.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import test25.DBCon;
import test25.UserDAO;

public class UserDAOImpl implements UserDAO {

	private Connection con;
	
	public UserDAOImpl() {
		this.con = DBCon.getCon();
	}
	
	@Override
	public int insertUserInfo(HashMap<String, String> userInfo) {
		String sql = "insert into user_info";
		sql += "(uiName, uiAge, uiCredat, uiCretim, uiEtc,uiDelete)";
		sql += "values(?,?,date_format(now(),'%Y%m%d'),"
				+ "date_format(now(),'%H%i%s'),?,'0')";
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			ps.setString(1, userInfo.get("uiName"));
			ps.setString(2, userInfo.get("uiAge"));
			ps.setString(3, userInfo.get("uiEtc"));
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public int deleteUserInfo(HashMap<String, String> userInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUserInfo(HashMap<String, String> userInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<HashMap<String, String>> selectUserInfoList(HashMap<String, String> userInfo) {
		// TODO Auto-generated method stub
		return null;
	}

}
