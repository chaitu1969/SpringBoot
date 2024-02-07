package com.chaitu.CRUDdemo;

import com.chaitu.CRUDdemo.DAO.StudentDAO;
import com.chaitu.CRUDdemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruDdemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(CruDdemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {

//			createStudent(studentDAO);

			createMultipleStudents(studentDAO);

//			 Find student data by using id
//			 readStudent(studentDAO);

//			queryForStudents(studentDAO);

//			queryForStudentsByLastName(studentDAO);

//			UpdateStudentUsingQuery(studentDAO);

//			DeleeStudentById(studentDAO);

//			DeleteAllBylastName(studentDAO);



		};
	}

	private void DeleteAllBylastName(StudentDAO studentDAO) {

		int value = studentDAO.deleteAll();

		System.out.println("Num of rows Deleted : " + value);

	}


	private void DeleeStudentById(StudentDAO studentDAO) {

		int studentid = 2;

		Student myStudent = studentDAO.find(studentid);

		studentDAO.delete(studentid);


	}

	private void UpdateStudentUsingQuery(StudentDAO studentDAO) {

		int studentID = 1;
		System.out.println("Updating the student with id " + studentID);

		Student myStudent = studentDAO.find(studentID);

		myStudent.setFirstName("Chinna");

		studentDAO.update(myStudent);

		System.out.println("updated Student : " + myStudent);

	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {

		List<Student> theStudents = studentDAO.findByLastName("read");

		for(Student studentdata : theStudents){
			System.out.println(studentdata);
		}

	}

	private void queryForStudents(StudentDAO studentDAO) {
//		get a list of students

		List<Student> theStudents = studentDAO.findAll();

//		display the list of students

		for(Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}

	}

	private void readStudent(StudentDAO studentDAO) {
		System.out.println("Fetiching data from the DataBase....");
//		Student tempStudent = new Student("ReadStudnet","read","read@gmail.com");
//		studentDAO.save(tempStudent);
		int id = 1;
		Student data = studentDAO.find(id);
		System.out.println(data);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		// Create multiple students

		System.out.println("Creating the 3 Student Objects ......");
		Student Student1 = new Student("Student4","S4","student1@gmail.com");
		Student Student2 = new Student("Student5","S5","student2@gmail.com");
		Student Student3 = new Student("Student6","S6","Studnet3@gmail.com");

		// save the student object
		System.out.println("Saving the 3 Studnet Objects");
		studentDAO.save(Student1);
		studentDAO.save(Student2);
		studentDAO.save(Student3);

	}

	private void createStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating the student object .........");
		Student tempstundent = new Student("Chaitanya", "Karle","Chaitanya.karle@gmail.com");

		//save the student object
		System.out.println("Saving the student ....");
		studentDAO.save(tempstundent);
		//display the id of the saved student object
		System.out.println("Saved student. Generated id: "+ tempstundent.getId());


	}

}
