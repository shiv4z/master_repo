package in.shiv.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.shiv.entity.Address;
import in.shiv.entity.Employee;
import in.shiv.repository.AddressRepository;
import in.shiv.repository.EmpRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeService {
	private EmpRepository empRepository;
	
	private AddressRepository addressRepo;
	
	//@Transactional(rollbackOn = Exception.class)
	@Transactional(rollbackFor = Exception.class)
	public void saveData() {
		 
		Employee employee = new Employee();
		employee.setEmpId(103);
		employee.setEmpName("SHYAM");
		employee.setEmpSalary(9000.0);
		
		empRepository.save(employee);
		
		Integer i=10/0;
		
		Address address = new Address();
		address.setAddressId(503);
		address.setEmpId(103);
		address.setState("ASSAM");
		address.setCity("TAWANG");
		addressRepo.save(address);
		
	}
	

}
