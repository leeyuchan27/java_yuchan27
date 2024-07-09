package j070901;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BoardDao {
	private Connection conn;
	private Statement st;
	private PreparedStatement pt;
	private ResultSet rs;
	
	public BoardDao() {
		DriverLoad();
		Connect();
	}
	public Board[] findByAll() {
		Board[]list=new Board[7];
		
		String sql="select *from test_board";
		
		try {
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			int i=0;
			while(rs.next()) {
				list[i]=new Board(rs.getInt("board_id"),rs.getString("title"),
						rs.getString("writer"),rs.getString("content"),
						rs.getInt("hit"));
				i++;
			}
			
		}catch(Exception e) {
			System.out.println("데이터 가져오기 실패");
		}
		
		
		return list;
	}
			
			
			
			
	private void DriverLoad() {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.print("드라이버 로드 실패");
		}
	}
	private void Connect() {
		String username="leeyuchan";
		String password="123456";
		String url="jdbc:mysql://localhost:3306/leeyuchan";
		try {
			conn=DriverManager.getConnection(url,username,password);
		}catch(Exception e) {
			System.out.println("접속 실패");
		}
	}
}
