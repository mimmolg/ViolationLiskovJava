class Rettangolo {
    protected int larghezza, altezza;

    public Rettangolo() {
    }

    public Rettangolo(int larghezza, int altezza) {
        this.larghezza = larghezza;
        this.altezza = altezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getArea() {
        return larghezza * altezza;
    }
}