package gmc.project.schoolmanagement.user.controller;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gmc.project.schoolmanagement.user.model.SignUpRequestModel;
import gmc.project.schoolmanagement.user.model.SignUpResponseModel;
import gmc.project.schoolmanagement.user.service.UserService;

@RestController
@RequestMapping(produces = "application/json", path = "/user")
public class UserController {
	
	private final Environment environment;
	private final UserService userService;

	public UserController(UserService userService, Environment environment) {
		super();
		this.environment = environment;
		this.userService = userService;
	}

	@PostMapping("/signup")
	public ResponseEntity<SignUpResponseModel> createUser(@RequestBody SignUpRequestModel signUpRequestModel) {
		
		SignUpResponseModel returnValue = userService.createUser(signUpRequestModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(returnValue);
		
	}
	
	@GetMapping("/status/check")
	public String statusCheck() {
		return "The Server is running in Port : " + environment.getProperty("local.server.port");
	}

}
