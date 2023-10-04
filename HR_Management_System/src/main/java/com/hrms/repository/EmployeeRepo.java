package com.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hrms.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
