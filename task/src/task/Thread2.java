package task;

public class Thread2 extends Thread {

//	SharedClass instance;
//	public Thread2(SharedClass instance) {
//		this.instance=instance;
//	}
	@Override
	public void run() {
		SharedClass.sharedMethod();
	}
}
