package exam01;

public class Television implements RemoteControl, SearchAble{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("전원 On");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("전원 Off");		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("현재 볼륨 : "+volume);
	}

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url+"를 검색합니다.");
	}	

}
