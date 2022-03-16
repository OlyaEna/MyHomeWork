package music;

import java.util.ArrayList;
import java.util.List;

public class Disc {
    private List<Track> trackList = new ArrayList<>();

    public Disc() {
        trackList.add(new Track("Tempers - Capital Pains", 3.48, MusicGenre.ELECTRONIC));
        trackList.add(new Track("Dido - Thank You", 3.38, MusicGenre.POP));
        trackList.add(new Track("Blood Orange – Champagne Coast", 4.52, MusicGenre.SOUL));
        trackList.add(new Track("Outkast - Ms. Jackson", 4.30, MusicGenre.RAP));
        trackList.add(new Track("Shakira -  Hips Don't Lie", 3.38, MusicGenre.POP));
        trackList.add(new Track("Gorillaz - Feel Good Inc", 3.42, MusicGenre.ROCK));
        trackList.add(new Track("Florence + The Machine - You've Got the Love", 2.48, MusicGenre.INDIE));
        trackList.add(new Track("ludovico Einaudi - Experience ", 5.15, MusicGenre.CLASSIC));
        trackList.add(new Track("Dustin O'Halloran - An Ending, A Beginning ", 2.08, MusicGenre.CLASSIC));
        trackList.add(new Track("Billie Holiday - Solitude", 3.27, MusicGenre.JAZZ));
        trackList.add(new Track("Britney Spears - Toxic", 3.18, MusicGenre.POP));
        trackList.add(new Track("Outkast - Roses", 6.30, MusicGenre.RAP));
        trackList.add(new Track("Nina Simon - I Put a Spell on You", 2.35, MusicGenre.JAZZ));
        trackList.add(new Track("TR/ST - Slug", 4.24, MusicGenre.ELECTRONIC));
        trackList.add(new Track("Tempers - Capital Pains", 3.48, MusicGenre.ELECTRONIC));
        trackList.add(new Track("Nelly Furtado - Maneater", 4.02, MusicGenre.POP));
        trackList.add(new Track("Chet Baker - My Funny Valentine", 2.12, MusicGenre.JAZZ));
        trackList.add(new Track("Tostone - In The Light", 5.53, MusicGenre.TECHNO));
        trackList.add(new Track("TR/ST - Candy Walls", 4.37, MusicGenre.ELECTRONIC));
        trackList.add(new Track("Peter Broderick - Eyes Closed and Traveling", 3.39, MusicGenre.CLASSIC));
    }

    public List<Track> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<Track> trackList) {
        this.trackList = trackList;
    }
}
