package exam01;

public class Car {
	public int speed;
	
	public void speedUp() {
		speed+=1;
		System.out.println("속도 1올라감");
	}
	
	public final void stop() {
		System.out.println("정지");
		speed = 0;
	}
}
