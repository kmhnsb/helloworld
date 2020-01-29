package com.cas.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/students")
public class StudentController {
    StudentService ss;

    public StudentService getSs() {
        return ss;
    }

    @Autowired
    public void setSs(StudentService ss) {
        this.ss = ss;
    }

    @RequestMapping(value = "/join", method = RequestMethod.POST)
    public void joinStudent(@RequestBody Student student) {
        //원래 여기서 Student DTO 가 student 로 바뀌어야 됨. param 에 Student DTO
        //form validation 만 가능하고 logic 은 들어오면 안된다.
        ss.joinStudent(student);
    }
}
