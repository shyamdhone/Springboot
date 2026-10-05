package com.app.Service;

import java.util.List;

import com.app.Model.Student;

public interface studentser {

    Student addStudent(Student stu);
    List<Student> getAll();
    
    
    Student updateStudent(Student stu);
    
    void deleteStudent(int id);
    

}