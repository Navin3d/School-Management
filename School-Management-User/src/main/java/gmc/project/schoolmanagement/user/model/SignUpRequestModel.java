package gmc.project.schoolmanagement.user.model;

import lombok.Data;

@Data
public class SignUpRequestModel {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String confirmPassword;
	private Gender gender;
	private String dob;
	
}
