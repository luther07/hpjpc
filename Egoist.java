class Egoist extends Thread {

    char name;
    OutChar outPut;

    public Egoist(char c, OutChar outputObj) {
        this.name = c;
        this.outPut = outputObj;
    }

    public void run() {
        for(int i=1;i<=300;i++) {
            outPut.out(name);
        }
    }
}