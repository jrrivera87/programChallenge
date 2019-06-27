package com.example.programChallenge.com.example.programChallenge.repo;

import com.example.programChallenge.com.example.programChallenge.dto.Student;
import org.springframework.data.jpa.repository.Query;

import java.util.*;

public class Repo implements RepoInterface {

    @Override
    public List<Student> findStudent(Date schoolYr, String campus, String studentID, Date entryDate, String gradeLevel, String name) {
        List<Student> matches = new ArrayList<>();
        return matches;
    }

    @Override
    public void createStudent(Date schoolYr, String campus, String studentID, Date entryDate, String gradeLevel, String name) {

    }

    @Override
    public <S extends Student> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Student> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Student> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Student> findAll() {
        return null;
    }

    @Override
    public Iterable<Student> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Student entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Student> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
