package music;

public class Track {
    private String name;
    private double duration;
    private MusicGenre musicGenre;

    public Track(String name, double duration, MusicGenre musicGenre) {
        this.name = name;
        this.duration = duration;
        this.musicGenre = musicGenre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public MusicGenre getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(MusicGenre musicGenre) {
        this.musicGenre = musicGenre;
    }

    @Override
    public String toString() {
        return "Name= " + name +
                ", Duration= " + duration +
                ", Genre= " + musicGenre;
    }
}
