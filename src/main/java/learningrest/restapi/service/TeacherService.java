package learningrest.restapi.service;

import learningrest.restapi.DAO.TeacherDAO;
import learningrest.restapi.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TeacherService implements TeacherServiceInterface{
    @Autowired
    private TeacherDAO teacherDAO;

    @Transactional
    @Override
    public List<Teacher> get() {
        return teacherDAO.get();
    }

    @Transactional
    @Override
    public Teacher get(int id) {
        return teacherDAO.get(id);
    }

    @Transactional
    @Override
    public void saveOrUpdate(Teacher teacher) {
        teacherDAO.save(teacher);
    }

    @Transactional
    @Override
    public void delete(int id) {
        teacherDAO.delete(id);
    }

}
