package br.com.brunosouza.dao;

import java.util.Collection;

import br.com.brunosouza.entity.Student;

public interface StudentDAO {

	public abstract Collection<Student> getAllStudents();

	public abstract Student getStudentById(int id);

	public abstract void removeStudentById(int id);

	public abstract void updateStudent(Student student);

	public abstract void insertStudentToDD(Student student);

}