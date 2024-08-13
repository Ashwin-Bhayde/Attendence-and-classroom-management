package Com.tka.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.tka.Dao.CourseDao;

import Com.tka.entity.Course;

@Service
public class CourseService {

	@Autowired
	CourseDao dao;
	public List<Course> getAllCourses() {
		List<Course> c1 = dao.getAllCourses();
		return c1;
	}
	public Course getCourseById(Long id) {
		List<Course> crlist = dao.getAllCourses();
		Course cS = null;
		for (Course c : crlist) {
			if (c.getId() == id) {
				cS = c;
	}
		}
		return cS;	
	}
	public Course InsertCoursedata(Course CS) {
		return dao.InsertCoursedata(CS);
		
	}
	
	public Course updateCourseData(Course CS) {
		return dao.updateCourseData(CS);
	
		
	}
	public Course deleteCourseDataAperid(int id) {
		return dao.deleteCourseDataAperid(id);
		
		
	}
}
