package Com.tka.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import Com.tka.Dao.ClassroomDao;
import Com.tka.entity.Classroom;

@Service
public class ClassroomService {

	@Autowired
	ClassroomDao dao;

	public List<Classroom> getAllClassroom() {
		List<Classroom> c1 = dao.getAllClassroom();
		return c1;
	}

//	public Classroom getClassroomById(long id) {
//		Classroom cr = dao.getAllClassroom();
//		for (Classroom c : clist) {
//			if (c.getId() == id) {
//				cr = c;
//			}
//		}
//		return cr;
//	}

	public Classroom Insertdata(Classroom cr) {
		return dao.saveclassroom(cr);

	}
	public Classroom updateClassroomDetail(Classroom cr) {
		return dao.updateClassroomDetail(cr);
	}

	public Classroom deleteClassroomDataAperid(int id) {
		return dao.deleteClassroomDataAperid(id);
		
	}
}
