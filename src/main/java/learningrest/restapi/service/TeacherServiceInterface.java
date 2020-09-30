package learningrest.restapi.service;

import learningrest.restapi.model.Teacher;

import java.util.List;

interface TeacherServiceInterface {
    List<Teacher> get();
    Teacher get(int id);

    void saveOrUpdate(Teacher teacher);

    void delete(int id);
}
