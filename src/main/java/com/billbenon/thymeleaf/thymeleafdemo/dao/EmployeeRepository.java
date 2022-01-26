package com.billbenon.thymeleaf.thymeleafdemo.dao;

import com.billbenon.thymeleaf.thymeleafdemo.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

    // add method to sort by last name
    public List<Employee> findAllByOrderByLastNameAsc();

    // search by name
    public List<Employee> findByFirstNameContainsOrLastNameContainsAllIgnoreCase(String name, String lName);
}
