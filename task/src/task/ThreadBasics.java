package task;

public class ThreadBasics extends Thread {
		public void run() {
			try {
				for(int i=1;i<=5;i++) {
					System.out.println(i);
					Thread.sleep(1500);
				}
			}catch (Exception e) {
				System.out.println(e);
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadBasics t1 = new ThreadBasics();
		ThreadBasics t2 = new ThreadBasics();
		ThreadBasics t3 = new ThreadBasics();
		ThreadBasics t4 = new ThreadBasics();
		ThreadBasics t5 = new ThreadBasics();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
