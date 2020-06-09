package Lab5;


public class Word extends SentenceElement{
    private final Letter[] word;

    public Word(Letter[] word) {
        this.word = word;
    }

    public Word(String wordString) {
        char[] charArray = wordString.toCharArray();
        word = new Letter[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            word[i] = new Letter(charArray[i]);
        }
    }

    public void printWord() {
        for (Letter each : word) {
            System.out.print(each.getLetter());
        }
    }

    @Override
    public String toString() {
        StringBuilder wordString = new StringBuilder();
        for (Letter letter : word) {
            wordString.append(letter.getLetter());
        }
        return wordString.toString();
    }
}
