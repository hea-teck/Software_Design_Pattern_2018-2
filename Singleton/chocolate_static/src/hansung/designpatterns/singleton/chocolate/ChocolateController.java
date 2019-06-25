package hansung.designpatterns.singleton.chocolate;

import java.util.Date;

public class ChocolateController {
	private static final int THREAD_NUM=1000;
	static long total=0;
	static long MIN=100;
	static long MAX=0;
	public static void main(String args[]) {

		Thread[] threads = new Thread[THREAD_NUM];
		for (int i = 0; i < THREAD_NUM; i++) {
			threads[i] = new Thread() {
				public void run() {
					long start = System.currentTimeMillis();
					ChocolateBoiler boiler = ChocolateBoiler.getInstance();
					long end = System.currentTimeMillis();
					long elapse = end-start;
					System.out.println("elapse =" +elapse);
//					boiler.fill();
//					boiler.boil();
//					boiler.drain();

				}
			};
		}

		for (int i = 0; i < THREAD_NUM; i++) {
			threads[i].start();
		}

	}
}
