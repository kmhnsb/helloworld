package com.cas.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepository sr;

    public void joinStudent(Student student) {

    }

    public StudentRepository getSr() {
        return sr;
    }
    @Autowired
    public void setSr(StudentRepository sr) {
        this.sr = sr;
    }
}
