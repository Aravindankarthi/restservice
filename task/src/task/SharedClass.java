package task;

public class SharedClass {

	public static synchronized void sharedMethod() {
		
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				Thread.sleep(1500);
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
