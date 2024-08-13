package Com.tka.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import Com.tka.entity.Department;

@Repository
public class DepartmentDao {


	@Autowired
	SessionFactory factory;

	public List<Department> getAllDepartments()
	{
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Department.class);
		List<Department> D1 = criteria.list();
		return D1;
	}

	public Department InsertDepartmentdata(Department D1) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(D1);

		tx.commit();
		return D1;
	}

	public Department updateDepartmentData(Department D1) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(D1);

		tx.commit();
		return D1;
	}

	public Department deleteDepartmentAperid(Long id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Department D1 = session.load(Department.class,id);
		session.delete(D1);

		tx.commit();
		return D1;
	}

}

