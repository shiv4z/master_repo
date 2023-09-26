package in.shiv.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shiv.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Serializable>{

}
