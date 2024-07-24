package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.Employee;
import com.app.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Config.xml");
		
		Employee employee1 = applicationContext.getBean(Employee.class);
		Employee employee2 = applicationContext.getBean(Employee.class);
		Employee employee3 = applicationContext.getBean(Employee.class);
		System.out.println("Employee Bean Hashcodes:");
		System.out.println(System.identityHashCode(employee1));
		System.out.println(System.identityHashCode(employee2));
		System.out.println(System.identityHashCode(employee3));
		
		Student student1 = applicationContext.getBean(Student.class);
		Student student2 = applicationContext.getBean(Student.class);
		Student student3 = applicationContext.getBean(Student.class);
		System.out.println("Student Bean Hashcodes:");
		System.out.println(System.identityHashCode(student1));
		System.out.println(System.identityHashCode(student2));
		System.out.println(System.identityHashCode(student3));
	}
}
