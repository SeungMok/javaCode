package oop;

public class Exam {
	private int kors;
	private int engs;
	private int maths;
	private int coms;
	
	int total = kors+engs+maths+coms;
	double avg = total / 4.0;
	
	public int getKors() {
		return kors;
	}
	public void setKors(int kors) {
		this.kors = kors;
	}
	public int getEngs() {
		return engs;
	}
	public void setEngs(int engs) {
		this.engs = engs;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getComs() {
		return coms;
	}
	public void setComs(int coms) {
		this.coms = coms;
	}
	
	
}
