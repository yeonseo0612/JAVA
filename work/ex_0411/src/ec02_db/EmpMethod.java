package ec02_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpMethod {
	
	public List<Emp> fine(String job_input){
		List<Emp> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql ="SELECT * FROM emp where job = ?";
        try {
            // DB 연결
            conn = DBUtil.getConnection();

            // SQL 실행을 위한 Statement 객체 생성
            pstmt = conn.prepareStatement(sql);
            //첫번째 물음표자리에 매개변수로 들어온 job 값으로 채워라.
            pstmt.setString(1, job_input);
            // 'emp' 테이블의 모든 데이터를 조회
            rs = pstmt.executeQuery();

            // 결과 출력
            while (rs.next()) {
            	Emp emp = new Emp();
                int empno = rs.getInt("empno");       // 사번
                String ename = rs.getString("ename"); // 이름
                String job = rs.getString("job");     // 직무
                int salary = rs.getInt("sal");     // 급여

                emp.setEmpno(empno);
                emp.setEname(ename);
                emp.setJob(job);
                emp.setSalary(salary);
                
                list.add(emp);
               
            }

        } catch (Exception e) {
            // 예외 발생 시 메시지 출력
            System.out.println("오류 발생: " + e.getMessage());
            e.printStackTrace();

        } finally {
            // 리소스 정리
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (Exception e2) {
                System.out.println("자원 해제 중 오류 발생: " + e2.getMessage());
            }
        }
		//EMP테이블에서 사원번호, 이름, 직종, 급여를 조회해서 하나의 행을 EMP 객체에 넣은 후 그 객체들을 ArrayList에 담아서 반환하기
		return list;
	}

	
	
}
