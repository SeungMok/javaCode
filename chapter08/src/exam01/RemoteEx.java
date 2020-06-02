package exam01;

public class RemoteEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		Radio radio = new Radio();
		RemoteControl rc_t = new Television();
		RemoteControl rc_r = new Radio();
		tv.turnOn();
		tv.turnOff();
		radio.turnOn();
		radio.turnOff();
		rc_r.turnOff();
		
		tv.setMute(true);
		radio.setMute(true);
		tv.search("무엇무엇");
	}

}
