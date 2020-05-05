/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-05-05 01:41:22
 * @modify date 2020-05-05 01:41:22
 * @desc [description]
 */
package com.gagan.springrestpaging.service;

import com.gagan.springrestpaging.model.Employee;
import com.gagan.springrestpaging.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    /**
     * Returs a page containing List and info about other pages
     */
    public Page<Employee> getAllEmployees(Integer pageNo, Integer pageSize, String sortBy) {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
        Page<Employee> pagedResult = repository.findAll(paging);
        return pagedResult;
    }

}