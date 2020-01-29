package com.cas.helloworld;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {
    public List<Student> findByName(String name);
}
