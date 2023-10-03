class Quadrato extends Rettangolo {
    public Quadrato() {}

    public Quadrato(int lato) {
        larghezza = altezza = lato;
    }

    @Override
    public void setLarghezza(int larghezza) {
        super.setLarghezza(larghezza);
        super.setAltezza(larghezza);
    }

    @Override
    public void setAltezza(int altezza) {
        super.setAltezza(altezza);
        super.setLarghezza(altezza);
    }
}