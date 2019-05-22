package org.study.user;

public class userList {
	public int User_id;
	public String User_accout;
	public String User_password;

	public void setUser_id(int User_id) {
		 this.User_id= User_id;
	}
	public int getUser_id() {
		return this.User_id;
	}

	public void setUser_accout(String User_accout) {
		this.User_accout=User_accout;
	}
	public String getUser_accout() {
		return this.User_accout;
	}

	public void setUser_password(String User_password) {
		this.User_password=User_password;
	}
	public String getUser_password() {
		return this.User_password;
	}

	@Override
	public String toString() {
		return "User_login [User_id="+User_id+",User_accout="+User_accout+",User_password="+User_password+"]";
	}
}
