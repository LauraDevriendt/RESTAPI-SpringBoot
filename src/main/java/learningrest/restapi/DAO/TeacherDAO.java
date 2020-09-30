package learningrest.restapi.DAO;

import learningrest.restapi.model.Teacher;

import java.util.List;

public interface TeacherDAO {
    List<Teacher> get();
    Teacher get(int id);

    void save(Teacher teacher);
    void delete(int id);

}
