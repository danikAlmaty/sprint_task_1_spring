package com.example.sprint_task_1_spring.repositories;

import com.example.sprint_task_1_spring.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentModelRepository extends JpaRepository<StudentModel, Long> {

}
