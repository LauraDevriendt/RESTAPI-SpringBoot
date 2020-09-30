package learningrest.restapi.service;

import learningrest.restapi.DAO.StudentDAO;
import learningrest.restapi.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService implements StudentServiceInterface{
    @Autowired
    private StudentDAO studentDAO;

    @Transactional
    @Override
    public List<Student> get() {
        return studentDAO.get();
    }

    @Transactional
    @Override
    public Student get(int id) {
        return studentDAO.get(id);
    }

    @Transactional
    @Override
    public void saveOrUpdate(Student student) {
        studentDAO.save(student);
    }

    @Transactional
    @Override
    public void delete(int id) {
        studentDAO.delete(id);
    }

}
