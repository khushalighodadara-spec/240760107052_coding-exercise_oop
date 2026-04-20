import java.util.LinkedList;

public class MusicPlaylist {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();
        playlist.add("Shape of You");
        playlist.add("Believer");
        playlist.add("Perfect");
        playlist.add("Blinding Lights");
        playlist.add("Levitating");
        System.out.println("Full Playlist:");
        System.out.println(playlist);
        String firstSong = playlist.removeFirst();
        System.out.println("\nPlaying song: " + firstSong);
        System.out.println("Playlist after playing first song:");
        System.out.println(playlist);
        String lastSong = playlist.removeLast();
        System.out.println("\nSkipped song: " + lastSong);
        System.out.println("Playlist after skipping last song:");
        System.out.println(playlist);

        /*
        Sample Output:
        Full Playlist:
        [Shape of You, Believer, Perfect, Blinding Lights, Levitating]

        Playing song: Shape of You
        Playlist after playing first song:
        [Believer, Perfect, Blinding Lights, Levitating]

        Skipped song: Levitating
        Playlist after skipping last song:
        [Believer, Perfect, Blinding Lights]
        */
    }
}
