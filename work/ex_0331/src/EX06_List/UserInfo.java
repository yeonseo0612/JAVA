package EX06_List;

public class UserInfo {
	private String id;
	private int pwd;
	
	public UserInfo(String userId, int userPwd) {
		this.id = userId;
		this.pwd = userPwd;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPwd() {
		return pwd;
	}
	public void setPwd(int pwd) {
		this.pwd = pwd; 
	}
	
}
