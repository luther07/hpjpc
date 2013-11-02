public class ThreadSkeleton extends Thread {
    public ThreadSkeleton() {

    }

    public void run() {
        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        ThreadSkeleton t = new ThreadSkeleton();
        t.start();
    }
}