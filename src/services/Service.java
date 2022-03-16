package services;

import music.*;

import java.util.List;

public class Service {
    private double duration = 0.0;

    public void printTrackList(List<Track> trackList) {
        for (Track track : trackList) {
            System.out.println(track.toString());
        }
        System.out.println();
    }

    public void getDuration(List<Track> trackList) {
        for (int i = 0; i < trackList.size(); i++) {
            duration += trackList.get(i).getDuration();
        }
        System.out.println("Total duration is " + duration + " min");
        System.out.println();
    }

    public void sortingByGenre(List<Track> trackList, MusicGenre musicGenre) {
        for (int i = 0; i < trackList.size(); i++) {
            if (trackList.get(i).getMusicGenre() == musicGenre) {
                System.out.println(trackList.get(i).toString());
            }
        }
    }

    public void sortingByTime(double from, double to, List<Track> trackList) {
        for (int i = 0; i < trackList.size(); i++) {
            if (trackList.get(i).getDuration() >= from && trackList.get(i).getDuration() <= to) {
                System.out.println(trackList.get(i).toString());
            } else {
                System.out.println("No song like this!");
                break;
            }
        }
    }
}
