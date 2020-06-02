package exam02;

public class FileInputStream  implements AutoCloseable{
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file+" 를 읽습니다.");
		
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(file+" 를 닫습니다.");
		
	}
	
}
