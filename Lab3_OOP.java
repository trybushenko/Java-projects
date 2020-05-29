public class Lab3_OOP {
    public static void main(String[] args) {
        String text = "The Beatles were an English rock band formed in Liverpool in 1960. " +
                "With a line-up comprising John Lennon, Paul McCartney, George Harrison and Ringo Starr, " +
                "they are regarded as the most influential band of all time. The group were integral to the development of 1960s " +
                "\n" +
                "counterculture and popular music's recognition as an art form. Rooted in skiffle, beat and 1950s rock and roll, " +
                "their sound incorporated elements of classical music and traditional pop in innovative ways; the band later explored " +
                "\n" +
                "music styles ranging from ballads and Indian music to psychedelia and hard rock. As pioneers in recording, " +
                "songwriting and artistic presentation, the group revolutionised many aspects of the music industry and were " +
                "often publicised as leaders of the era's youth and sociocultural movements.\n" +
                "\n" +
                "Led by primary songwriters Lennon and McCartney, the Beatles built their reputation playing clubs in " +
                "Liverpool and Hamburg over three years from 1960, initially with Stuart Sutcliffe playing bass. " +
                "The core trio of Lennon, McCartney and Harrison, together since 1958, went through a succession of drummers," +
                "\n" +
                " including Pete Best, before asking Starr to join them in 1962. Manager Brian Epstein moulded them into a" +
                " professional act and producer George Martin guided and developed their recordings, greatly expanding their " +
                "domestic success after their first hit, \"Love Me Do\", in late 1962. As their popularity grew into the intense " +
                "\n" +
                "fan frenzy dubbed \"Beatlemania\", the band acquired the nickname \"the Fab Four\", with Epstein, Martin and " +
                "other members of the band's entourage sometimes given the informal title of \"fifth Beatle\".";
        String[] new_text = text.split(" ");
        String[] final_text = new String[new_text.length];
        for (int i = 0; i < new_text.length; i++) {
            final_text[i] = new_text[i].replace(new_text[i].charAt(new_text[i].length() - 1), Character.MIN_VALUE);
        }
        for (String el: final_text) {
            System.out.print(el + " ");
        }
    }
}
/*
* C3 = 2 (String)
* C13 = В кожному слові заданого тексту, видалити всі попередні входження останньої літери цього слова.
* */