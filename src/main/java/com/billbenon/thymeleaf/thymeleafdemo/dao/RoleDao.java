package com.billbenon.thymeleaf.thymeleafdemo.dao;

import com.billbenon.thymeleaf.thymeleafdemo.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
