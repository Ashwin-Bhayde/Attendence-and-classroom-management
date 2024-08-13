package Com.tka.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import Com.tka.entity.Classroom;

@Repository
public class ClassroomDao {

	@Autowired
	SessionFactory factory;

	public List<Classroom> getAllClassroom() 
	{
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Classroom.class);
		List<Classroom> C1 = criteria.list();
		return C1;
	}

	public Classroom saveclassroom(Classroom cr){
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(cr);

		tx.commit();
		return cr;

	}

	public Classroom updateClassroomDetail(Classroom cr) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(cr);

		tx.commit();
		return cr;
	}


	public Classroom deleteClassroomDataAperid(int id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Classroom cr = session.load(Classroom.class,id);
		session.delete(cr);

		tx.commit();
		return cr;
	}

	public Class<Classroom> getClassroomById() {
		// TODO Auto-generated method stub
		return null;
	}


	

	


}
