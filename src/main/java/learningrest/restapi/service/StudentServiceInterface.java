package learningrest.restapi.service;

import learningrest.restapi.model.Student;

import java.util.List;

interface StudentServiceInterface {
    List<Student> get();
    Student get(int id);

    void saveOrUpdate(Student student);

    void delete(int id);
}
