package com.mysite.sbb3;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
	private final UsersRepository usersRepository;
	
	public Site_User create(String id, String username, Integer phonenum, String email, String password) {
		Site_User users = new Site_User();
		users.setId(id);
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		users.setPassword(password);
		users.setUsername(username);
		users.setEmail(email);
		users.setPhonenum(phonenum);
		return this.usersRepository.save(users);
	}
}
