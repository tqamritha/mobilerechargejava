
public class Userbean {

	private int userid;
	private String name;
	private String email;
	private String password;
	private long mobile;
	
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "Userbean [userid=" + userid + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", mobile=" + mobile + "]";
	}

	
}
