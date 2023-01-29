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
        findSeasonByName(userInput);
    }

    private void findSeasonByName(String userInput) {
        for (Season season : Season.values()) {
            if (userInput.equalsIgnoreCase(season.getSeasonNameInPl())) {
                System.out.println(Arrays.toString(season.months));
            }
        }
    }
}

