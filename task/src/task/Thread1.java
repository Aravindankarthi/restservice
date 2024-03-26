package task;

public class Thread1 extends Thread {

//	SharedClass instance;
//	public Thread1(SharedClass instance) {
//		this.instance=instance;
//	}
	public void run() {
		SharedClass.sharedMethod();
	}
}
