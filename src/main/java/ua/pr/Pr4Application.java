package ua.pr;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Pr4Application {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		Student student = (Student) context.getBean("student");
		student.getInfo();
		System.out.println("\n============\n");
		Instrumentalist instr = (Instrumentalist) context.getBean("instrumentalist");
		instr.play();
		System.out.println("\n============\n");	}
}
