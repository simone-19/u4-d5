package elementoMultimediale;

public abstract class Element {
    protected String titolo;
    protected int volume;
    protected int luminosità;

    public Element(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }
}
