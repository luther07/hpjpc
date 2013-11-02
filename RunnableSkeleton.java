public class RunnableSkeleton implements Runnable {
    public RunnableSkeleton() {

    }

    public void run() {
        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        RunnableSkeleton r = new RunnableSkeleton();
        Thread t = new Thread(r);
        t.start();
    }
}