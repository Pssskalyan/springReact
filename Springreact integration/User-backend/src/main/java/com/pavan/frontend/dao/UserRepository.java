package com.pavan.frontend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pavan.frontend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	

}
