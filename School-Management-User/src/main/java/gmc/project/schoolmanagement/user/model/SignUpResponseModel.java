package gmc.project.schoolmanagement.user.model;

import lombok.Data;

@Data
public class SignUpResponseModel {
	
	private String firstName;
	private String lastName;
	private String email;
	private String userId;
	private Roles role;
	
}
