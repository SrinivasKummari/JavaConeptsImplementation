package org.srinivas.javaconceptsimplementation;
import java.util.Collections;
import java.util.Comparator;

public class StudentListTest {

	public static void main(String[] args) {
		StudentList studentList=new StudentList();
		Student s=new Student("Srini",27);
		Student s2=new Student("Ravs",21);
		Student s1=new Student("Ravs",24);
		studentList.addStudent(s);
		studentList.addStudent(s1);
		studentList.addStudent(s2);
		Collections.sort(studentList.getStudents(), new Comparator<Student>() {

			@Override
			public int compare(Student stu1, Student stu2) {
				if(stu1.getName().compareTo(stu2.getName()) ==0){
					if(stu1.getAge()>stu2.getAge()){
						return 1;
					}else if(stu1.getAge()<stu2.getAge()){
						return -1;
					}else{
						return 0;
					}
					 
				}else{
					return stu1.getName().compareTo(stu2.getName());
				}
				
			}
		
		});
		for(Student student:studentList){
			System.out.println(student);
		}

	}

}
