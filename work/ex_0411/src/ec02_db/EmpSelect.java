package ec02_db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;

public class EmpSelect {
    public static void main(String[] args) {
//        Connection conn = null;
//        Statement stmt = null;
//        ResultSet rs = null;
//        Emp emp = new Emp();
//        try {
//            // DB 연결
//            conn = DBUtil.getConnection();
//
//            // SQL 실행을 위한 Statement 객체 생성
//            stmt = conn.createStatement();
//
//            // 'emp' 테이블의 모든 데이터를 조회
//            rs = stmt.executeQuery("SELECT * FROM emp");
//
//            // 결과 출력
//            while (rs.next()) {
//                int empno = rs.getInt("empno");       // 사번
//                String ename = rs.getString("ename"); // 이름
//                String job = rs.getString("job");     // 직무
//                int salary = rs.getInt("sal");     // 급여
//
//                
//                emp.setEmpno(empno);
//                emp.setEname(ename);
//                emp.setJob(job);
//                emp.setSalary(salary);
//                
//                System.out.printf("사번 : %d, 이름 : %s, 직무 : %s, 급여 : %d\n", empno, ename, job, salary);
//            }
//
//        } catch (Exception e) {
//            // 예외 발생 시 메시지 출력
//            System.out.println("오류 발생: " + e.getMessage());
//            e.printStackTrace();
//
//        } finally {
//            // 리소스 정리
//            try {
//                if (rs != null) rs.close();
//                if (stmt != null) stmt.close();
//                if (conn != null) conn.close();
//            } catch (Exception e2) {
//                System.out.println("자원 해제 중 오류 발생: " + e2.getMessage());
//            }
//        }
    	
    	EmpMethod empM = new EmpMethod();
    	
    	String job = "MANAGER";
    	List<Emp> empMs = empM.fine(job);
    	
    	for(Emp emp : empMs) {
    		System.out.println(emp.getEmpno() + " "+ emp.getEname()  + " " +emp.getJob()  + " " +emp.getSalary());
    	}
    	
    }
}