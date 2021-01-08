package com.springbootjpa_h2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootjpa_h2.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	public abstract List<Employee> findByLastName(String lastName);
	
	List<Employee> findByFirstNameAndLastName(String firstName , String lastName);
	
	
}
