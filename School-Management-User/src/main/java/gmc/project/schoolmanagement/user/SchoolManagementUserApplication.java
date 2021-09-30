package gmc.project.schoolmanagement.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableDiscoveryClient
@SpringBootApplication
public class SchoolManagementUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementUserApplication.class, args);
	}
	
	@Bean
	public BCryptPasswordEncoder byBCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
