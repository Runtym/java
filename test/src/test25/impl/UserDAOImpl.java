package test25.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import test25.DBCon;
import test25.UserDAO;

public class UserDAOImpl implements UserDAO {

	private Connection con;
	
	public UserDAOImpl() {
	}
	
	@Override
	public int insertUserInfo(HashMap<String, String> userInfo) {
		this.con = DBCon.getCon();
		int result = 0;
		String sql = "insert into user_info";
		sql += "(uiName, uiAge, uiCredat, uiCretim, uiEtc,uiDelete)";
		sql += "values(?,?,date_format(now(),'%Y%m%d'),"
				+ "date_format(now(),'%H%i%s'),?,'0')";
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			ps.setString(1, userInfo.get("uiName"));
			ps.setString(2, userInfo.get("uiAge"));
			ps.setString(3, userInfo.get("uiEtc"));
			result= ps.executeUpdate();
			this.con.commit();
		} catch (SQLException e) {
			try {
				this.con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			DBCon.closeCon();
		}
		
		return result;
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
		ArrayList<HashMap<String, String>> userInfoList = 
				new ArrayList<HashMap<String, String>>();
		this.con = DBCon.getCon();
		String sql = "select uiNum, uiName, uiAge, uiCredat, uiCretim"
				+ ", uiDelete, uiEtc from user_info";
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				HashMap<String, String> user = new HashMap<String, String>();
				user.put("uiNum", rs.getString("uiNum"));
				user.put("uiName", rs.getString("uiName"));
				user.put("uiAge", rs.getString("uiAge"));
				user.put("uiCredat", rs.getString("uiCredat"));
				user.put("uiCretim", rs.getString("uiCretim"));
				user.put("uiDelete", rs.getString("uiDelete"));
				user.put("uiEtc", rs.getString("uiEtc"));
				userInfoList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon.closeCon();
		}
		
		return userInfoList;
	}

}
