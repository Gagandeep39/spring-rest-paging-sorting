/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-05-05 01:37:52
 * @modify date 2020-05-05 01:37:52
 * @desc [description]
 */
package com.gagan.springrestpaging.controller;

import com.gagan.springrestpaging.model.Employee;
import com.gagan.springrestpaging.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity<Page<Employee>> fetchAll(
        @RequestParam(defaultValue = "0") Integer pageNo,
        @RequestParam(defaultValue = "10") Integer pageSize, 
        @RequestParam(defaultValue = "id") String sortBy) {
                Page<Employee> page = employeeService.getAllEmployees(pageNo, pageSize, sortBy);
            return new ResponseEntity<Page<Employee>>(page, new HttpHeaders(), HttpStatus.OK); 
        }

}