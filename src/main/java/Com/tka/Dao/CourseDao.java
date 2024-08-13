package Com.tka.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Com.tka.entity.Classroom;
import Com.tka.entity.Course;

@Repository
public class CourseDao {

	private static final Object CS = null;
	@Autowired
	SessionFactory factory;
	
	public List<Course> getAllCourses() 
	{
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Course.class);
		List<Course> C1 = criteria.list();
		return C1;
	
	}

	public Course InsertCoursedata(Course CS) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(CS);

		tx.commit();
		return CS;
		
	}

	public Object updateCouseData(Classroom cS) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(CS);

		tx.commit();
		return CS;
	}

	public Course updateCourseData(Course CS) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(CS);

		tx.commit();
		return CS;
	}

	public Course deleteCourseDataAperid(int id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Course CS = session.load(Course.class,id);
		session.delete(CS);

		tx.commit();
		return CS;
	}


	
}
