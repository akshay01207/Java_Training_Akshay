package Case_Study5_Referal.bean;

import java.io.Serializable;

public class ReferralTo implements Serializable {
    String name;
    String mobile;
    String email;
    public ReferralTo(String name, String mobile, String email) {
        super();
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }
    public String nameCheck(String name) {
        name="";
        return name;
        
    }
    @Override
    public String toString() {
        return " [name=" + name + ", mobile=" + mobile + ", email=" + email + "]";

    }
	public String getName1() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getMobile() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
