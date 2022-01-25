package com.billbenon.thymeleaf.thymeleafdemo.controller;

import com.billbenon.thymeleaf.thymeleafdemo.entity.Employee;
import com.billbenon.thymeleaf.thymeleafdemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller()
@RequestMapping("/employees")
public class EmployeeController {
    public EmployeeService employeeService;

    public EmployeeController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    @GetMapping("/list")
    public String listEmployees(Model theModel) {
        List<Employee> theEmployees = employeeService.findAll();
        theModel.addAttribute("employees", theEmployees);
        return "employees/list-employees";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {
        Employee theEmployee = new Employee();
        theModel.addAttribute("employee", theEmployee);
        return "employees/employee-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeId") int theId, Model theModel) {
        Optional<Employee> theEmployee = employeeService.findById(theId);
        theModel.addAttribute("employee", theEmployee);
        return "employees/employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {
        employeeService.save(theEmployee);
        return "redirect:/employees/list";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("employeeId") int theId) {
        employeeService.deleteById(theId);
        return "redirect:/employees/list";
    }
}
