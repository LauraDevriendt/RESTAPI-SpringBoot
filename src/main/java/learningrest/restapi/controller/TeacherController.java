package learningrest.restapi.controller;

import learningrest.restapi.model.Teacher;
import learningrest.restapi.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

    @RestController
    @RequestMapping("/api")
    public class TeacherController {

        @Autowired
        private TeacherService teacherService;


        @GetMapping("/teachers")
        public List<Teacher> get(){
            return teacherService.get();
        }

        @PostMapping("/teachers")
        public Teacher save(@RequestBody Teacher teacher){
            teacherService.saveOrUpdate(teacher);
            return teacher;
        }

        @GetMapping("/employee/{id}")
        public Teacher get(@PathVariable int id){

            if (teacherService.get(id) == null){
                throw new RuntimeException("Teacher does not exist");
            }
            return teacherService.get(id);

        }

        @DeleteMapping("/teachers/{id}")
        public String delete(@PathVariable int id) {
            teacherService.delete(id);
            return "Teacher has been deleted with id:" + id;
        }

        @PutMapping("/teachers")
        public Teacher update(@RequestBody Teacher teacher){
            teacherService.saveOrUpdate(teacher);
            return teacher;
        }

    }


