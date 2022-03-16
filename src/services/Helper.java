package services;

import music.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Helper {
    private final Service service = new Service();
    private final Scanner scanner = new Scanner(System.in);
    private final Disc disc = new Disc();

    public void showOptions() {
        Helper helper = new Helper();
        int choice = -1;

        while (choice != 0) {
            System.out.println("\nWhat would you like to do now?");
            System.out.println("Choose one of the options:");
            System.out.println("1. See the Tracklist");
            System.out.println("2. Calculate the duration of tracks");
            System.out.println("3. Find tracks by a specific genre");
            System.out.println("4. Sort tracks by length");
            System.out.println("0. Exit");

            choice = scanner.nextInt();
            helper.getSwitch(choice);
        }
    }


    public void getSwitch(int choice) {
        switch (choice) {
            case 1 -> service.printTrackList(disc.getTrackList());

            case 2 -> service.getDuration(disc.getTrackList());

            case 3 -> {
                try {
                    System.out.println("Choose a genre: ELECTRONIC, ROCK, JAZZ, SOUL, INDIE, TECHNO, CLASSIC, POP, RAP");
                    String genre = scanner.next();
                    MusicGenre musicGenre = MusicGenre.valueOf(genre);
                    service.sortingByGenre(disc.getTrackList(), musicGenre);
                } catch (IllegalArgumentException e) {
                    System.out.println("Wrong option! Try again");
                }
            }

            case 4 -> {
                System.out.println("Enter the range: ");
                System.out.println("From: ");
                double from = scanner.nextDouble();
                System.out.println("To: ");
                double to = scanner.nextDouble();
                service.sortingByTime(from, to, disc.getTrackList());
            }

            case 0 -> System.exit(0);

            default -> throw new InputMismatchException("Wrong option! Try again");
        }
    }
}

