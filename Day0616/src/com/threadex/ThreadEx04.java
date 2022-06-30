package com.threadex;

class ThreadExam02 extends Thread {

	private String firstname;
	private String lastname;

	public ThreadExam02(String a, String b, int x) {
		firstname = a;
		lastname = b;
		setPriority(x);
		setDaemon(true);
	}

	@Override
	public void run() {
		System.out.println(Thread.activeCount());
		int xx = Thread.activeCount();
		Thread[] th = new Thread[xx];
		
		Thread.enumerate(th);

		for (int i = 0; i < th.length; i++) {
			System.out.println(
							  th[i].getName() + " : " 
							+ th[i].getPriority() + " : "
							+ th[i].isDaemon() + " : " 
							+ th[i].isAlive());
		}
		
		while(true) {
			System.out.println("ÀÌ¸§ : " + firstname);
			try {
				Thread.sleep(100);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println("¼º : " + lastname);
		}
	}
}

public class ThreadEx04 {

	public static void main(String[] args) {
		ThreadExam02 t1 = new ThreadExam02("±æµ¿", "È«", 1);
		t1.start();
		try {
			Thread.sleep(150);
		}catch(InterruptedException ie) {}
		ThreadExam02 t2 = new ThreadExam02("À¯½Å", "±è", 5);
		t2.start();
		try {
			Thread.sleep(150);
		}catch(InterruptedException ie) {}
	}

}
