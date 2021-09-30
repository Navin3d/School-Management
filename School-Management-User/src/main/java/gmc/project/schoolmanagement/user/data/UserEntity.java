package gmc.project.schoolmanagement.user.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import gmc.project.schoolmanagement.user.model.Gender;
import gmc.project.schoolmanagement.user.model.Roles;
import lombok.Data;

@Data
@Entity
public class UserEntity implements Serializable {

	private static final long serialVersionUID = -8967584132244944514L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String userId;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false)
	private String encryptedPassword;
	
	@Column
	private String phoneNumber;
	
	@Column
	private String dob;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Gender gender;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Roles role;

}