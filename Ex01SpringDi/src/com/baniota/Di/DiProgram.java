package com.baniota.Di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baniota.Di.UI.ExamConsole;
import com.baniota.Di.entity.AiExam;
import com.baniota.Di.entity.Exam;

public class DiProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Exam exam = new AiExam();
//		ExamConcole console = new InlineExamConsole();
//		console.setExam(exam);
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/baniota/Di/spring_di.xml");
		ExamConsole console = (ExamConsole) context.getBean("console");
		console.print();
	}
}