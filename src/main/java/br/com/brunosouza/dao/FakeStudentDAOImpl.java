package br.com.brunosouza.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import br.com.brunosouza.entity.Student;

@Repository
@Qualifier("fakeData")
public class FakeStudentDAOImpl implements StudentDAO {

	private static Map<Integer, Student> students;
	
	static{
		students = new HashMap<Integer, Student>(){
			{
				put(1, new Student(1,"Said", "Computer Science"));
				put(2, new Student(2,"Alex", "Finance"));
				put(3, new Student(3,"Anna", "Maths"));
			}
		};
	}
	
	/* (non-Javadoc)
	 * @see br.com.brunosouza.dao.StudentDAO#getAllStudents()
	 */
	public Collection<Student> getAllStudents(){
		return this.students.values();
	}
	
	/* (non-Javadoc)
	 * @see br.com.brunosouza.dao.StudentDAO#getStudentById(int)
	 */
	public Student getStudentById(int id){
		return this.students.get(id);	
	}

	/* (non-Javadoc)
	 * @see br.com.brunosouza.dao.StudentDAO#removeStudentById(int)
	 */
	public void removeStudentById(int id) {
		this.students.remove(id);
	}
	
	/* (non-Javadoc)
	 * @see br.com.brunosouza.dao.StudentDAO#updateStudent(br.com.brunosouza.entity.Student)
	 */
	public void updateStudent(Student student){
		Student s = students.get(student.getId());
		student.setCourse(student.getCourse());
		student.setName(student.getName());
		students.put(student.getId(), student);
	}

	/* (non-Javadoc)
	 * @see br.com.brunosouza.dao.StudentDAO#insertStudentToDD(br.com.brunosouza.entity.Student)
	 */
	public void insertStudentToDD(Student student) {
		this.students.put(student.getId(), student);
		
	}
	
}
