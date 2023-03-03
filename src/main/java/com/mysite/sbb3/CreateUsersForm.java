package com.mysite.sbb3;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUsersForm {
	
	@Size(min = 3, max =25)
	@NotEmpty(message = "사용자 아이디는 필수 입력사항입니다.")
	private String id;
	@Size(min = 8, max =16)
	@NotEmpty(message = "사용자 비밀번호는 필수 입력사항입니다.")
	private String password;
	@Size(min = 8, max =16)
	@NotEmpty(message = "비밀번호 확인은 필수 입력사항입니다.")
	private String repassword;
	@Email
	@NotEmpty(message = "사용자 이메일는 필수 입력사항입니다.")
	private String email;
	@Size(max = 12)
	@NotEmpty(message = "사용자 이름은 필수 입력사항입니다.")
	private String username;
	@NotEmpty(message = "사용자 폰번호는 필수 입력사항입니다.")
	private Integer phonenum;
	
}
