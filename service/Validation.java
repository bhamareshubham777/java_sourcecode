package service;
//Model Layer , Service Layer
public class Validation {
	public boolean validate(String user, String pass) {
		if(user.equals("admin") && pass.equals("123")) {
			return true;
		}else {
			return false;
		}
	}
}
