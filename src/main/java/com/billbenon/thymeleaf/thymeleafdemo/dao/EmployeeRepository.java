package com.billbenon.thymeleaf.thymeleafdemo.dao;

import com.billbenon.thymeleaf.thymeleafdemo.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

}
