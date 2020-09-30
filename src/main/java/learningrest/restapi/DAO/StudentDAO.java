package learningrest.restapi.DAO;

import learningrest.restapi.model.Student;
import learningrest.restapi.model.Teacher;

import java.util.List;

public interface StudentDAO {
    List<Student> get();
    Student get(int id);

    void save(Student student);
    void delete(int id);

}
