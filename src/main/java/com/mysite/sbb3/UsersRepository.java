package com.mysite.sbb3;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Site_User, Integer> {
	
}
