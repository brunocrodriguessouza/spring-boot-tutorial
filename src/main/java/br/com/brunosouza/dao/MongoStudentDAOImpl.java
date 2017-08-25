package br.com.brunosouza.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import br.com.brunosouza.entity.Student;

@Repository
@Qualifier("mongoData")
public class MongoStudentDAOImpl implements StudentDAO {
	
	Connection mongoConnection;

	public Collection<Student> getAllStudents() {
		return new ArrayList<Student>(){
			{
				add(new Student(1, "Mario", "Nothing"));
			}
		};
	}

	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeStudentById(int id) {
		// TODO Auto-generated method stub
		
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	public void insertStudentToDD(Student student) {
		// TODO Auto-generated method stub
		
	}

}
