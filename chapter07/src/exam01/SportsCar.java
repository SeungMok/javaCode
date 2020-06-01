package exam01;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
		System.out.println("속도 10올라감");
	}
//	
//	public void stop() {
//		System.out.println("정지");
//		speed = 0;
//	}
}
