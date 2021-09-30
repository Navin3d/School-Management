package gmc.project.schoolmanagement.user.shared;

import java.io.Serializable;

import gmc.project.schoolmanagement.user.model.Gender;
import gmc.project.schoolmanagement.user.model.Roles;
import lombok.Data;

@Data
public class UserDto implements Serializable {
	
	private static final long serialVersionUID = -1005263271238780140L;
	
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String encryptedPassword;
	private String phoneNumber;
	private String dob;
	private Gender gender;
	private Roles role;

}
