/*
 * HelloThread.java - a threaded Hello World example.
 */

class Hello extends Thread {
    public static void main(String[] args) {
        Thread lo=new Hello();
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        lo.start();
        for(int i=1;i<=500;i++)
        System.out.println(System.currentTimeMillis());
    }

    public void run() {
        for(int i=1;i<=500;i++) {
            System.out.println("ho");
	}
    }
}