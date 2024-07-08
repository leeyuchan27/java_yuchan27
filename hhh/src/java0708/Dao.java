package java0708;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dao {
	
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	private PreparedStatement pt;
	
	Dao(){
		DriverInit();
		Connect();
	}
	
	private void DriverInit() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println("드라이버 로드 실패");
		}
	}
	private void Connect() {
		String user="leeyuchan";
		String password="123456";
		String url="jdbc:mysql://localhost:3306/leeyuchan";
		
		try {
		conn=DriverManager.getConnection(url, user, password);
		}catch(Exception e) {
			System.out.println("데이터 베이스 접속 실패");
		}
	}
	
	public void insert( Member m ) {
		
		String sql=
		"insert into test_member( name, kor, eng, mat,total,std_avg) values(?,?,?,?,?,?)";
		
		try {
			
			pt=conn.prepareStatement(sql);
			pt.setString(1, m.getName() );
			pt.setInt(2, m.getKor() );
			pt.setInt(3, m.getEng() );
			pt.setInt(4, m.getMat() );
			pt.setInt(5, m.getTotal() );
			pt.setInt(6, m.getStd_avg() );
			pt.executeUpdate();
			
		}catch(Exception e) {
			System.out.println("데이터 저장 실패");
		}
//		String sql="insert into test_member(name,kor,eng,mat,total,"
//				+ "std_avg) values('"+m.getName()+"',"+m.getKor()+","+
//				m.getEng()+","+m.getMat()+","+m.getTotal()+","+
//				m.getStd_avg()+")";
//		
//		try {
//		st=conn.createStatement();
//		st.executeUpdate(sql);
//		
//		}catch(Exception e) {
//			System.out.println("데이터 저장 실패");	
//		}
//		
	}
	
	public Member[] select() {
		Member[]list=null;
		
		String sql="select count(*) as cnt from test_member";
		
		try {
			int size=0;
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			if(rs.next()) {
				size=rs.getInt("cnt");
			}
			if(size!=0) {
				list=new Member[size];
				int i=0;
				sql="select*from test_member";
				rs=st.executeQuery(sql);
				while(rs.next()) {
					list[i]=new Member(rs.getInt("member_id") ,
							rs.getString("name"),rs.getInt("kor"),
							rs.getInt("eng"), rs.getInt("mat"), 
							rs.getInt("total"), rs.getInt("std_avg"));
					i++;
				}
			}
			
		}catch(Exception e) {
			System.out.println("데이터 조회 실패");
		}
		return list;
		
	}
	
	
	
}
