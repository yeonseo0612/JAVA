package ec02_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonMethod {

	public List<Person> fine(){
		List<Person> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM person";
		
		try {
			conn = DBUtil.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Person person = new Person();
				int idx = rs.getInt("idx");
				int age = rs.getInt("age");
				String name = rs.getString("name");
				
				person.setAge(age);
				person.setIdx(idx);
				person.setName(name);
				
				list.add(person);
			}
		} catch (Exception e) {
			// TODO: handle exception
			  System.out.println("오류 발생: " + e.getMessage());
	            e.printStackTrace();
		}finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					pstmt.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				  System.out.println("자원 해제 중 오류 발생: " + e2.getMessage());
			}
		}
		return list;
	}
	
	public int addPerson(int idx_in, String name_in, int age_in) {
		int result = 0;
		
		List<Person> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into person(idx,name,age)values(?,?,?)";
		
		try {
			conn = DBUtil.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, idx_in);
			pstmt.setString(2, name_in);
			pstmt.setInt(3, age_in);
			int res = pstmt.executeUpdate();
			

		    if (res > 0) {
		        System.out.println("삽입 성공: " + res);
		    } else {
		        System.out.println("삽입 실패");
		    }

			
			
		} catch (Exception e) {
			// TODO: handle exception
			  System.out.println("오류 발생: " + e.getMessage());
	            e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					pstmt.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				  System.out.println("자원 해제 중 오류 발생: " + e2.getMessage());
			}
		}
		
		
		return result;
	}
	
}
