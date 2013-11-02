class Sched extends Thread {

    public void run() {
        for(;;) {
            try {
                sleep(5);
	    }
            catch(InterruptedException e) { }
	}
    }

    public static void main(String[] args) {
        Thread q;
        int i;
        OutChar C=new OutChar();

        for(i='A';i<='C';i++) {
            q=new Egoist((char)i,C);
            q.setPriority(Thread.NORM_PRIORITY-1);
            // try commenting the above out
            q.start();
	}
        q=new Sched();
        q.setPriority(Thread.MAX_PRIORITY);
        // setDaemon specifies the thread should run
        // as long as other work is being done,
        // and no longer.
        q.setDaemon(true);
        q.start();
    }

}