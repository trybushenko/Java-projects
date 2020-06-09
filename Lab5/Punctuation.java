package Lab5;

public class Punctuation extends SentenceElement {
    private final String symbols;

    public Punctuation(String symbols) {
        this.symbols = symbols;
    }

    @Override
    public String toString() {
        return this.symbols;
    }
}

