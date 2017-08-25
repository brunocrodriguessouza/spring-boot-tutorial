package br.com.brunosouza.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.brunosouza.dao.StudentDAO;
import br.com.brunosouza.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	@Qualifier("fakeData")
	private StudentDAO studentDAO;
	
	public Collection<Student> getAllStudents(){
		return this.studentDAO.getAllStudents();
	}
	
	public Student getStudentById(int id){
		return this.studentDAO.getStudentById(id);	
	}

	public void removeStudentById(int id) {
		studentDAO.removeStudentById(id);
	}
	
	public void updateStudent(Student student){
		this.studentDAO.updateStudent(student);
	}

	public void insertStudent(Student student) {
		this.studentDAO.insertStudentToDD(student);
		
	}

}
