package test;

public class User 
{
	String username;
	String pwd;
	
	
	@Override
	public String toString() {
		return "User [username=" + username + ", pwd=" + pwd + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	

}
