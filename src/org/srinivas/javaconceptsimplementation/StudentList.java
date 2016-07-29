package org.srinivas.javaconceptsimplementation;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentList implements Iterable<Student>{
	private ArrayList<Student> students;
	
	public StudentList() {
		students=new ArrayList<>();
	}

	/**
	 * @return the students
	 */
	public ArrayList<Student> getStudents() {
		return students;
	}

	/**
	 * @param students the students to set
	 */
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public void addStudent(Student s){
		students.add(s);
	}

	@Override
	public Iterator<Student> iterator() {
		// TODO Auto-generated method stub
		return students.iterator();
	}
	

}
