package test25;

import java.util.ArrayList;
import java.util.HashMap;

import test25.impl.UserDAOImpl;

public class Exec {

	public static void main(String[] args) {
		UserDAO udao = new UserDAOImpl(DBCon.getCon());
		ArrayList<HashMap<String,String>> userList
		= udao.selectUserList();
		
		for(HashMap<String,String> user:userList) {
			System.out.println(user);
		}
		
		DBCon.close();
		
	}
}
