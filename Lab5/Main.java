package Lab5;

// Task: write Letter, Word, Punctuation, Sentence and Text classes to manipulate with them. Then task is to do the
// same thing as I did in lab 3. Split text and delete all previous occurances of the last letter of the word.
public class Main {
    public static void main(String[] args) {
        // new object - word
        Word word = new Word(new Letter[]{
                new Letter('H'),
                new Letter('e'),
                new Letter('l'),
                new Letter('l'),
                new Letter('o')});
        //new object - word
        Word word1 = new Word(new Letter[]{
                new Letter('W'),
                new Letter('o'),
                new Letter('r'),
                new Letter('l'),
                new Letter('d')
        });
        // creating punctuations
        Punctuation punctuation = new Punctuation(",");
        Punctuation punctuation1 = new Punctuation("!");
        //Output "Hello"!
        System.out.println('\n' + word.toString());
        // Creating sentence "Hello, World!"
        Sentence sentence3 = new Sentence(new SentenceElement[]{word, punctuation, word1, punctuation1});
        //output it
        System.out.println('\n' + sentence3.toString());
        // creating two sentences to create a text
        Sentence sentence = new Sentence("Heollo Atrt adnd, world!");
        Sentence sentence1 = new Sentence("Loeve tehe whoele wordld");
        Sentence sentence2 = new Sentence("Adress popopo daddddddddd");
        // creating text object
        Text text = new Text(new Sentence[]{sentence, sentence1, sentence2});
        //output text object
        System.out.println('\n' + text.toString());
        //Working with task to lab 3 in oop. Overloading of method. Using strings
        TaskLab3 taskLab3 = new TaskLab3();
        String string = taskLab3.getString();
        String text1 = Text.delete_previous_entrances(string);
        System.out.println('\n' + text1); // works fine
        //working with array of sentences ----- tex has type Text
        String array_sentences = Text.delete_previous_entrances(text);
        System.out.println('\n' + array_sentences);

    }
}
