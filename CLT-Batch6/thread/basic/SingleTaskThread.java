
package basic;

class SingleTask implements Runnable {
	public void run() {
                    task1();
                    task2();
                    task3();
		}
	void task1() {
		System.out.println("This is task1");
		}
        void task2() {
		System.out.println("This is task2");
		}
        void task3() {
		System.out.println("This is task3");
		}
}

class SingleTaskThread {
    public static void main(String args[]) {
        SingleTask st = new SingleTask();
        Thread t = new Thread(st);
        t.start();
    }
}
    
