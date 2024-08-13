package Com.tka.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Com.tka.Service.DepartmentService;
import Com.tka.entity.Department;

@RestController
@RequestMapping("/api/Department")
public class DepartmentController {
	@Autowired
	private DepartmentService DeptService;

	@GetMapping("/getAllDepartments")
	public List<Department> getAllDepartments() {
		return DeptService.getAllDepartments();
	}

	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable Long id) {
		return DeptService.getDepartmentById(id);
	}
	@PostMapping("/InsertDepartmentdata")
	public Department createDepartment(@RequestBody Department D1) {
		DeptService.InsertDepartmentdata(D1);
		return D1;
	}

	@PutMapping("/updateDepartmentData/id")
	public void updateDepartmentData(@RequestBody Long id, @RequestBody Department D1) {
		DeptService.updateDepartmentData(D1);
	}

	@DeleteMapping("/deleteddata/id")
	public void deleteDepartmentAperid(@PathVariable Long id) {
		DeptService.deleteDepartmentAperid(id);

	}

}
