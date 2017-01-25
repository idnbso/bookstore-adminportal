package com.bookstore.adminportal;

import com.bookstore.adminportal.domain.User;
import com.bookstore.adminportal.domain.security.Role;
import com.bookstore.adminportal.domain.security.UserRole;
import com.bookstore.adminportal.service.UserService;
import com.bookstore.adminportal.utlity.SecurityUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class AdminportalApplication implements CommandLineRunner {

	private final UserService userService;

	@Autowired
	public AdminportalApplication(UserService userService) {
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(AdminportalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User user1 = new User();
//		user1.setUsername("admin");
//		user1.setPassword(SecurityUtility.passwordEncoder().encode("p"));
//		user1.setEmail("admin@gmail.com");
//		Set<UserRole> userRoles = new HashSet<>();
//		Role role1= new Role();
//		role1.setRoleId(0);
//		role1.setName("ROLE_ADMIN");
//		userRoles.add(new UserRole(user1, role1));
//
//		userService.createUser(user1, userRoles);
	}
}
