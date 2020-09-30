package learningrest.restapi.DAO;


import learningrest.restapi.model.Teacher;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class TeacherDAOimpl implements TeacherDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Teacher> get() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Teacher> query = currentSession.createQuery("from Teacher", Teacher.class);
        return query.getResultList();
    }

    @Override
    public Teacher get(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Teacher.class, id);
    }

    @Override
    public void save(Teacher teacher) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(teacher);
    }

    @Override
    public void delete(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Teacher teacher = currentSession.get(Teacher.class, id);
        currentSession.delete(teacher);
    }

}
