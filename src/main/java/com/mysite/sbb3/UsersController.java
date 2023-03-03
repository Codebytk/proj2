package com.mysite.sbb3;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/proj")
public class UsersController {
	private final UserService userService;
	
	@GetMapping("/sing")
	public String singup(CreateUsersForm userCreateForm) {
		return "sign_form";
	}
	@PostMapping("/sing")
	public String singup(@Valid CreateUsersForm userCreateForm, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "sign_form";
		}
		if(!userCreateForm.getPassword().equals(userCreateForm.getRepassword())) {
			bindingResult.rejectValue("password2", "passwordInCorrect", "2개의 패스워드가 일치하지 않습니다.");
			return "sign_form";
		}
		userService.create(userCreateForm.getId(), userCreateForm.getUsername(),
				userCreateForm.getPhonenum(), userCreateForm.getEmail(), userCreateForm.getPassword());
		
		return "redirect:/";
	}
	
}
