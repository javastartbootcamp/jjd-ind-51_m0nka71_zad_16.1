package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class SeasonManager {

    // uzupełnij metodę - do wczytywania danych użyj przekazany Scanner
    public void run(Scanner scanner) {

        System.out.println("Podaj porę roku:");
        for (Season season : Season.values()) {
            System.out.println(season.getSeasonNameInPl());
        }
        String userInput = scanner.nextLine();

        System.out.println("W tej porze roku są następujące miesiące:");
        if (userInput.equalsIgnoreCase(Season.SPRING.getSeasonNameInPl())) {
            System.out.println(Arrays.toString(Season.SPRING.months));

        } else if (userInput.equalsIgnoreCase(Season.SUMMER.getSeasonNameInPl())) {
            System.out.println(Arrays.toString(Season.SUMMER.months));

        } else if (userInput.equalsIgnoreCase(Season.AUTUMN.getSeasonNameInPl())) {
            System.out.println(Arrays.toString(Season.AUTUMN.months));

        } else if (userInput.equalsIgnoreCase(Season.WINTER.getSeasonNameInPl())) {
            System.out.println(Arrays.toString(Season.WINTER.months));
        }
    }
}

