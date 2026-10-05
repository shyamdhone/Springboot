package com.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Model.Student;
import com.app.Repository.StudentRepo;
@Service
public class StudentService implements studentser{
	@Autowired
	StudentRepo rep;
	
	

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return rep.save(student);
	}



	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return rep.findAll();
	}



	@Override
	public Student updateStudent(Student stu) {
		
		return rep.save(stu);
	}



	@Override
	public void deleteStudent(int id) {
		rep.deleteById(id);
		
		
	}

}
