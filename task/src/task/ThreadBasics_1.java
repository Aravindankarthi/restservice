package task;

public class ThreadBasics_1 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadBasics t1 = new ThreadBasics();
		ThreadBasics t2 = new ThreadBasics();
		ThreadBasics t3 = new ThreadBasics();
		ThreadBasics t4 = new ThreadBasics();
		ThreadBasics t5 = new ThreadBasics();
		Thread obj=new Thread(t1);
		Thread obj1=new Thread(t2);
		Thread obj2=new Thread(t3);
		Thread obj3=new Thread(t4);
		Thread obj4=new Thread(t5);
		obj.start();
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
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
