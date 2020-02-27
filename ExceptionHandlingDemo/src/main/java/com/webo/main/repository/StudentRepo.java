package com.webo.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.webo.main.model.Student;
import java.lang.String;
import java.util.List;
@Repository
public interface StudentRepo extends PagingAndSortingRepository<Student, Integer> {

	List<Student> findBySname(String sname);
}
