package com.billbenon.thymeleaf.thymeleafdemo.service;

import com.billbenon.thymeleaf.thymeleafdemo.entity.User;
import com.billbenon.thymeleaf.thymeleafdemo.user.CrmUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	public void save(CrmUser crmUser);
}
