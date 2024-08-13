package Com.tka.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;



import Com.tka.Service.ClassroomService;
import Com.tka.entity.Classroom;

@RestController
public class ClassroomController {

	@Autowired
	private ClassroomService C1service;

	@GetMapping("/TestApi")
	public String TestApi()
	{
		return "Hello";
	}
	@GetMapping("/getAllClassroom")

	public List<Classroom> getAllClassroom() 
	{
		return C1service.getAllClassroom();
	}

//	@GetMapping("/{id}")
//	public Classroom getClassroomById(@PathVariable Long id) 
//	{
//		return C1service.getClassroomById(id);
//
//	}
	@PostMapping("/Insertdata")
	public Classroom Insertdata(@RequestBody Classroom cr) 
	{
		C1service.Insertdata(cr);
		return cr;
	}

	@PutMapping("updateClassroomData")
	public void updateClassroomDetail(@RequestBody Classroom cr)
	{
		C1service.updateClassroomDetail(cr);
	}	   
	        
@DeleteMapping("deleteClassroomData/{id}")
public void deleteClassroomDataAperid(@PathVariable int id)
{
	C1service.deleteClassroomDataAperid(id);
}
}


