package Com.tka.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.tka.Dao.DepartmentDao;

import Com.tka.entity.Department;


@Service
public class DepartmentService {

	@Autowired
	DepartmentDao dao;
	
	public List<Department> getAllDepartments() {
		List<Department> D1 = dao.getAllDepartments();
		return D1;
	}
	public Department getDepartmentById(Long id) {
		List<Department> Dlist = dao.getAllDepartments();
		Department D1 = null;
		for (Department d : Dlist) {
			if (d.getId() == id) {
				D1 = d;
	}

		}
		return D1;
	}
	public Department InsertDepartmentdata(Department D1) {
	return dao.InsertDepartmentdata(D1);
		
	}
	public Department updateDepartmentData(Department D1) {
	return dao.updateDepartmentData(D1);
		
	}
	public Department deleteDepartmentAperid(Long id) {
		return dao.deleteDepartmentAperid(id);
		
	}
}
