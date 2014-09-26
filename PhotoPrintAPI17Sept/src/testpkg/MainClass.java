package testpkg;

import in.pulseinfotech.printphoto.dto.User;
import in.pulseinfotech.printphoto.exception.EmailIDException;
import in.pulseinfotech.printphoto.exception.MobileNumberExcetion;

public class MainClass {
	public static void main(String[] args) {
		try {
			User u = new User();
			u.setName("Bismillah Hirrahama Nirrahim");
			u.setEmailId("bismmilah@gmail.com");
			u.setMobileNumber(18272892);
		} catch (EmailIDException eidex) {
			System.out.println("Email ID Exception " + eidex.getMessage());
		} catch (MobileNumberExcetion e) {
			System.out.println("Mobile Number  Exception " + e.getMessage());
			e.printStackTrace();
		}
	}
}
