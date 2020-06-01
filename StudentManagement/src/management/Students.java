package management;

public class Students {
	String name;
	int korean;
	int math;
	int english;
	
	int sum = 0;
	double avg = 1.0;
	
	public Students(String name, int korean, int math, int english) {
		super();
		this.name = name;
		this.korean = korean;
		this.math = math;
		this.english = english;
		this.sum = korean+math+english;
		this.avg = sum / 3.0;
	}
}
