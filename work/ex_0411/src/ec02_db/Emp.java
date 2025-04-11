package ec02_db;

public class Emp {
	private int empno;
	private String ename;
	private String job;
	private int salary;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	 @Override
	    public String toString() {
	        return "사번: " + empno + ", 이름: " + ename + ", 직무: " + job + ", 급여: " + salary;
	    }
}
