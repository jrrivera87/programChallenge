package com.example.programChallenge.com.example.programChallenge.dto;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Students")
public class Student
{
    @Column(name = "SchoolYr", nullable = false)
    private Date schoolYr;

    @Column(name = "Campus", nullable = false)
    private String campus;

    @Id
    @Column(name = "StudentID", nullable = false)
    private String studentID;

    @Column(name = "EntryDate", nullable = false)
    private Date entryDate;

    @Column(name = "GradeLevel", nullable = false)
    private String gradeLevel;

    @Column(name = "Name", nullable = false)
    private String name;

    protected Student () {}

    public Student(Date schoolYr, String campus, String studentID, Date entryDate, String gradeLevel, String name) {
        this.schoolYr = schoolYr;
        this.campus = campus;
        this.studentID = studentID;
        this.entryDate = entryDate;
        this.gradeLevel = gradeLevel;
        this.name = name;
    }

    public Date getSchoolYr() {
        return schoolYr;
    }

    public void setSchoolYr(Date schoolYr) {
        this.schoolYr = schoolYr;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
