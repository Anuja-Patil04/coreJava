package com.SpringDataJPA.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringDataJPA.Entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	

}
