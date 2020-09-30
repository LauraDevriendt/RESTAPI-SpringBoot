package learningrest.restapi.DAO;

import learningrest.restapi.model.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Student> get() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Student> query = currentSession.createQuery("from Student", Student.class);
        return query.getResultList();
    }

    @Override
    public Student get(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Student.class, id);
    }

    @Override
    public void save(Student student) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(student);
    }

    @Override
    public void delete(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Student student = currentSession.get(Student.class, id);
        currentSession.delete(student);
    }

}

