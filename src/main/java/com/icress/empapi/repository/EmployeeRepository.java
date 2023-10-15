package com.icress.empapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.icress.empapi.entity.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Long> {

}
