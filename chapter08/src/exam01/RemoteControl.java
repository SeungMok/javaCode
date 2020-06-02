package exam01;


public interface RemoteControl {
	public static final int MAX_VOLUME = 100;
	public int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("무음처리 됩니다.");
		else
			System.out.println("무음처리 해제됩니다.");
	}
}
