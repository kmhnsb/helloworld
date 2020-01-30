package com.cas.helloworld;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(path = "students-api", collectionResourceRel = "students-api")
public interface StudentRepository extends CrudRepository<Student, Long> {
    public List<Student> findByName(String name);
}
