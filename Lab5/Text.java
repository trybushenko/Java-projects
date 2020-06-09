package Lab5;

import java.util.Arrays;

public class Text {
    Sentence[] sentences;

    public Text(Sentence[] sentences) {
        this.sentences = sentences;
    }
    public Text(String String_text) {
        String[] sentencesStrings = String_text.split("(?<=[?!.]) ");
        sentences = new Sentence[sentencesStrings.length];
        for (int i = 0; i < sentencesStrings.length; i++) {
            sentences[i] = new Sentence(sentencesStrings[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder textString = new StringBuilder();
        for (int i = 0; i < sentences.length; i++) {
            textString.append(sentences[i].toString()).append(i != sentences.length - 1 ? " " : "");
        }
        return textString.toString();
    }
    public static String delete_previous_entrances(String string) {
        String[]  old_split_text = string.split(" ");
        String[] new_text = new String[string.split(" ").length];
        for (int i = 0; i < old_split_text.length; i++) {
            new_text[i] = old_split_text[i].replace(old_split_text[i].charAt(old_split_text[i].length() - 1), Character.MIN_VALUE);
        }
        return Arrays.toString(new_text);
    }
    public static String delete_previous_entrances(Text sentences) {
        String string = sentences.toString();
        String[] old_split_text = string.split(" ");
        String[] new_text = new String[old_split_text.length];
        for (int i = 0; i < old_split_text.length; i++) {
            new_text[i] = old_split_text[i].replace(old_split_text[i].charAt(old_split_text[i].length() - 1), Character.MIN_VALUE);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String raw: new_text) {
            stringBuilder.append(raw).append(" ");
        }
        return stringBuilder.toString();
    }
}
