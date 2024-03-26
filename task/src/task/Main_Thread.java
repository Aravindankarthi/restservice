package task;

public class Main_Thread {

	public static void main(String[] args) {
		
//		SharedClass s1= new SharedClass();
//		SharedClass s2= new SharedClass();
		
		Thread1 t1 =new Thread1();
		Thread1 t2 = new Thread1();
		
		Thread2 t3 = new Thread2();
		Thread2 t4 = new Thread2();
		
		t1.start();
		t2.start();
		
		t3.start();
		t4.start();
	}

}
