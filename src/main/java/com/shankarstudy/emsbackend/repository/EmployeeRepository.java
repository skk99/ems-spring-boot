package com.shankarstudy.emsbackend.repository;

import com.shankarstudy.emsbackend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
