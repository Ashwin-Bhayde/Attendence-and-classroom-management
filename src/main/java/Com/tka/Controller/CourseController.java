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

import Com.tka.Service.CourseService;

import Com.tka.entity.Course;

@RestController
@RequestMapping ("/api/courses")
public class CourseController {

    @Autowired
    private CourseService C1service;

	
    @GetMapping("/getAllCourses")
    
    public List<Course> getAllCourses() {
        return C1service.getAllCourses();
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Long id) {
        return C1service.getCourseById(id);
    }

    @PostMapping("/InsertCoursedata")
    public Course createCourse(@RequestBody Course CS) {
    	C1service.InsertCoursedata(CS);
        return CS;
    }

    @PutMapping("/updateCourseData")
    public void updateCouseData(@RequestBody Course CS)
	{
		C1service.updateCourseData(CS);
	}	   
    @DeleteMapping("/deleteCourseData")
    public void deleteCourseDataAperid(@PathVariable int id)
    {
    	C1service.deleteCourseDataAperid(id);
    }
}


