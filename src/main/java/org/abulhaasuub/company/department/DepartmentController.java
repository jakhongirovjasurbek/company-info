package org.abulhaasuub.company.department;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/")
	public String mainPage() {
		return "<h2> Welcome to the application! </h2>";
	}
	
	@GetMapping("/departments")
	public List<Department> getDepartments(){
		return departmentService.getAllDepartments();
	}
	
	@GetMapping("/departments/{id}")
	public Department getDepartmentById(@PathVariable("id") String id) {
		return departmentService.getDepartmentById(id);
		
	}
	
	@PostMapping("/departments")
	public void createDepartment(@RequestBody Department department) {
		departmentService.createDepartment(department);
	}
	
	@PutMapping("/departments/{id}")
	public void updateDepartment(@PathVariable("id") String id, @RequestBody Department department) {
		departmentService.updateDepartment(id, department);
	}
	
	@DeleteMapping("departments/{id}")
	public void deleteDepartment(@PathVariable("id") String id) {
		departmentService.deleteDepartment(id);
	}

}
