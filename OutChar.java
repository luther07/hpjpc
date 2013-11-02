class OutChar {

    int column;

    public OutChar() {
        this.column = 0;
    }

    public synchronized void out(char letter) {
        System.out.print(new Character(letter).toString());
        ++column;
        if (column % 50 == 0) {
            System.out.println("\n");
	}
    }
}