package exam01;

public class Cellphone {
	String model;
	String color;
	
	void powerOn() {System.out.println("전원 on");}

	public Cellphone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public Cellphone() {
		System.out.println("CellPhone 생성");
	}
	
	
	
}
