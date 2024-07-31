package DAO;

import java.sql.SQLException;

import DTO.MemberDTO;

public class MemberDAO extends DBConnect {
	
	public boolean login(String id,String pw) {
		String sql="select*from member where user_id=? and user_password=?";
		
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, id);
			pt.setString(2, pw);
			rs=pt.executeQuery();
			
			if(rs.next()) {
				return true;
			}
		}catch(SQLException e) {
			System.out.println("ȸ�� �α��� ��ȸ �� �����߻�");
		}
		return false;
	}
	
	public void save(MemberDTO member) {
		
		String sql="insert into member(user_id,user_password,user_email,user_name)"
				+" values(?,?,?,?)";
		
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, member.getUserId());
			pt.setString(2, member.getUserPassword());
			pt.setString(3, member.getUserEmail());
			pt.setString(4, member.getUserName());
			pt.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("ȸ������ member���̺� ���� ����");
			e.printStackTrace();
		}
	}
	
}
