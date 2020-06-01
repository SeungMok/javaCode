package exam01;

public class DmbCellphone extends Cellphone{
	int channel;
	

	public DmbCellphone() {
		super("삼성","레드");
		System.out.println("DmbCellPhone 생성");
	}


	@Override
	public String toString() {
		return "DmbCellphone [channel=" + channel + "]";
	}


	public DmbCellphone(int channel) {
		super("삼성","레드");
		this.channel = channel;
		System.out.println("DmbCellPhone 생성 channel 추가");
	}


	@Override
	void powerOn() {
		// TODO Auto-generated method stub
		super.powerOn();
		System.out.println("DMB!");
	}
	
	
}
