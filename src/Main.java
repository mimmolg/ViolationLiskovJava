class Test {

    static void getAreaTest(Rettangolo r) {
        int larghezza = r.getLarghezza();
        r.setAltezza(10);
        System.out.println("Risultato previsto " + (larghezza * 10) + ", ottenuto " + r.getArea());
    }

    public static void main(String[] args) {
        Rettangolo rc = new Rettangolo(2, 3);
        getAreaTest(rc);

        Rettangolo sq = new Quadrato();
        sq.setLarghezza(5);
        getAreaTest(sq);
    }
}
/**Nel primo test, creiamo un rettangolo di larghezza 2 ed altezza 3 e chiamiamo getAreaTest.
L'output è 20 come previsto, ma le cose vanno male se passiamo un quadrato.
Questo perché la chiamata della funzione setAltezza del test sta impostando anche la larghezza, restituendoci un risultato inaspettato.
 */