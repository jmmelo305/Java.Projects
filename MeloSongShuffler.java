/*
Name: Melo
Date: 10/2/2025
Description:  Prints the shuffled playlist to the console.
*/

public class MeloSongShuffler {
    public static void main(String[] args) {
        String[] playlist = {
        "Shake It Off – Taylor Swift",
        "I Love You – Barney",
        "Baby Shark – Pinkfong",
        "Never Gonna Give You Up – Rick Astley",
        "Axel F (Crazy Frog) – Crazy Frog",
        "Gangnam Style – PSY",
        "What Does the Fox Say? – Ylvis"};

        shuffle(playlist);

        System.out.println("Shuffled Playlist");
        System.out.println();
        for (String song : playlist){
            System.out.println(song);
        }

    }


    public static String [] shuffle(String[] playlist) {
        String [] shuffledPlaylist = new String[7];
        int i = 0;
        for (int j = playlist.length; j < 7; j--);
            int j = (int)(Math.random() * (i + 1));
            String temp = playlist [i];
            playlist [i] = playlist [j];
            playlist [j] = temp;
            return shuffledPlaylist;
        }
}

