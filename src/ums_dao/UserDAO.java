package ums_dao;

import java.util.HashSet;

import ums_dto.UserDTO;

public class UserDAO {
	DBConnection conn;
	
	public UserDAO() {
		conn = new DBConnection("UserTable.txt");
	}


	public boolean join(UserDTO newUser) {
		return conn.insert(newUser.toString());
	}

	public boolean login(String userid, String userpw) {
		HashSet<String> rs = conn.select(0, userid);
		for(String line : rs) {
			String[] datas = line.split("\t");
			if(userpw.contentEquals(datas[1])) {
				//로그인 성공
				UserDTO loginUser = new UserDTO(datas);
				Session.set("loginUser", loginUser);
				return true;
			}
		}
		//로그인 실패
		return false;
	}

	public boolean checkId(String userid) {
		HashSet<String> rs = conn.select(0, userid);
		return rs.size()==0;
	}


	public boolean modifyUser(String userid, int col, String newData) {
		return conn.update(userid, col, newData);
	}




	
	
	
}
