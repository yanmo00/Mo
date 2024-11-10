package test1024;

public class VIP {
    String username;
    String password;
    String sex;
    String phone;

    // 构造方法
    public VIP(String username, String password) {
        this.setName(username);
        this.setPassword(password);
    }
    
    
    
    public VIP(String username, String password, String sex, String phone) {
		super();
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.phone = phone;
	}



	public VIP() {
    }

    public void setName(String username) {
        this.username = username;
    }

    public String getName() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
    

}
