package org.abulhaasuub.company.department;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;


@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	
	public List<Department> getAllDepartments(){
		List<Department> departments = new ArrayList<>();
		departmentRepository.findAll().forEach(departments::add);
		
		return departments;
	}
	
	public Department getDepartmentById(String id) {
		return departmentRepository.findById(id).get();
	}
	
	public void createDepartment(Department department) {
		departmentRepository.save(department);
	}

	public void updateDepartment(String id, Department department) {
		departmentRepository.save(department);
	}

	public void deleteDepartment(String id) {
		departmentRepository.deleteById(id);
	}

}
