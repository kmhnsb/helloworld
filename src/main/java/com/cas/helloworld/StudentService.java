package com.cas.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository sr;

    public StudentRepository getSr() {
        return sr;
    }
    @Autowired
    public void setSr(StudentRepository sr) {
        this.sr = sr;
    }
    public void joinStudent(Student student) {
        //누군가 나에게 student 를 주면 저장하면 되게 하려고 함.
        //injection 하기. CRUD repository 에 있는 기능이 전부 나옴.
        sr.save(student);
    }
    public List<Student> findStudentByName(String name) {
        return sr.findByName(name);
    }
}
