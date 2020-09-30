package learningrest.restapi.controller;

import learningrest.restapi.model.Student;
import learningrest.restapi.model.Teacher;
import learningrest.restapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/students")
    public List<Student> get(){
        return studentService.get();
    }

    @PostMapping("/students")
    public Student save(@RequestBody Student student){
        studentService.saveOrUpdate(student);
        return student;
    }

    @GetMapping("/students/{id}")
    public Student get(@PathVariable int id){

        if (studentService.get(id) == null){
            throw new RuntimeException("Teacher does not exist");
        }
        return studentService.get(id);

    }

    @DeleteMapping("/students/{id}")
    public String delete(@PathVariable int id) {
        studentService.delete(id);
        return "Teacher has been deleted with id:" + id;
    }

    @PutMapping("/students")
    public Student update(@RequestBody Student student){
        studentService.saveOrUpdate(student);
        return student;
    }

}
