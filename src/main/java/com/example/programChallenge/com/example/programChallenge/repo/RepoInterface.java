package com.example.programChallenge.com.example.programChallenge.repo;

import com.example.programChallenge.com.example.programChallenge.dto.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface RepoInterface extends CrudRepository<Student, Integer>
{
    @Query("SELECT * FROM Students WHERE id= LOWER(:lastName)")
    public List<Student> findStudent(@Param("SchoolYr") Date schoolYr, @Param("Campus") String campus,
                                     @Param("StudentID") String studentID, @Param("EntryDate") Date entryDate,
                                     @Param("GradeLevel") String gradeLevel, @Param("Name") String name);

    @Query("INSERT INTO Students (SchoolYr,Campus,StudentID,EntryDate,GradeLevel,Name) VALUES (value1, value2, value3, ...); ")
    public void createStudent(@Param("SchoolYr") Date schoolYr, @Param("Campus") String campus,
                              @Param("StudentID") String studentID, @Param("EntryDate") Date entryDate,
                              @Param("GradeLevel") String gradeLevel, @Param("Name") String name);
}


