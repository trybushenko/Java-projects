package Lab5;


public class Main {
    public static void main(String[] args) {
        Word word = new Word(new Letter[]{
                new Letter('H'),
                new Letter('e'),
                new Letter('l'),
                new Letter('l'),
                new Letter('o')});
        Word word1 = new Word(new Letter[]{
                new Letter('W'),
                new Letter('o'),
                new Letter('r'),
                new Letter('l'),
                new Letter('d')
        });
        Punctuation punctuation = new Punctuation(",");
        Punctuation punctuation1 = new Punctuation("!");
        System.out.println(word.toString());
        Sentence sentence3 = new Sentence(new SentenceElement[]{word, punctuation, word1, punctuation1});
        Sentence sentence = new Sentence("Hello Art and, world!");
        Sentence sentence1 = new Sentence("Love the whole world");
        Text text = new Text(new Sentence[]{sentence, sentence1});
        System.out.println(text.toString());
        System.out.println(sentence3.toString());
//        String text1 = Text.delete_previous_entrances(string);
//        System.out.println(text1);


    }
}
