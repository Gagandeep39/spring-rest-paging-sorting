/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-05-05 01:36:59
 * @modify date 2020-05-05 01:36:59
 * @desc [description]
 */
package com.gagan.springrestpaging.repository;

import com.gagan.springrestpaging.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}