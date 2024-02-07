package com.chaitu.springboot.APIdemo.Rest;

import com.chaitu.springboot.APIdemo.Entity.Employee;
import com.chaitu.springboot.APIdemo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private  EmployeeService employeeService;

//    private EmployeeDAO employeeDAO;

//    quick and dirty : inject employee DAO
    @Autowired
    public EmployeeRestController(EmployeeService theEmployee){
        employeeService = theEmployee;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){
        Employee theEmployee = employeeService.findById(employeeId);
        if(theEmployee == null){
            throw new RuntimeException("Employee not Found " + employeeId);
        }
        return theEmployee;
    }

//    Adding a new employee
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee){
        //       if they pass id in json set it id to 0
        theEmployee.setId(0);

       return employeeService.save(theEmployee);
    }

//    Updating existing employee
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee){
        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;
    }

//    Delete a Employee
    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
        Employee tempEmployee = employeeService.findById(employeeId);

        if(tempEmployee == null){
            throw new RuntimeException("Employee didnot exist " + employeeId);
        }

        employeeService.deleteById(employeeId);
        return "Succefully Deleted employee ID " + employeeId;

    }

}
