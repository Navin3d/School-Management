package gmc.project.schoolmanagement.user.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import gmc.project.schoolmanagement.user.model.SignUpRequestModel;
import gmc.project.schoolmanagement.user.model.SignUpResponseModel;
import gmc.project.schoolmanagement.user.shared.UserDto;

public interface UserService extends UserDetailsService {
	SignUpResponseModel createUser(SignUpRequestModel signUpRequestModel);
	UserDto getUserByEmail(String email);
}
