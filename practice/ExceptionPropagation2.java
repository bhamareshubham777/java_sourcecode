package practice;

public class ExceptionPropagation2 {
	public static void main(String[] args) {
		MainApp e1=new MainApp();
		e1.display();
	}
	
}
class MainApp{
	public void test() {
		System.out.println("TEST STARTED");
		int c=10/0;
		System.out.println("TEST ENDED");
	}
	
	public void info() {
		try {
			test();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void display() {
		info();
	}
}

