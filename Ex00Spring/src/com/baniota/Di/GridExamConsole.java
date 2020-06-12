package com.baniota.Di;

import com.baniota.Di.UI.ExamConcole;
import com.baniota.Di.entity.Exam;

public class GridExamConsole implements ExamConcole {
	private Exam exam;
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("----------------------------");
		System.out.println("Total is "+exam.getTotal());
		System.out.println("----------------------------");
	}

	@Override
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		this.exam = exam;
	}

}
