package com.ritika.SpringBootCrud.repository;

import com.ritika.SpringBootCrud.bean.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject, String> {
}
