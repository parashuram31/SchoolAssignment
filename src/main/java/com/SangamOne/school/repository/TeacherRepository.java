package com.SangamOne.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SangamOne.school.entity.TeachersDetails;

public interface TeacherRepository extends JpaRepository<TeachersDetails, Integer> {

}
