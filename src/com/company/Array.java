package com.company;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        String channels[] = new String[]{"Культура", "ОНТ", "Sport", "БТ", "БТ 2", "AnimalsPlanet", "Панамский (ну а почему бы и нет)"};
        String closeTVProgramm = new String();

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please, enter channel\n");
            int channelNumber = scanner.nextInt();

            if (!(channelNumber > channels.length)) {
                for (int i = 0; i < channels.length; i++) {
                    if (channelNumber == i + 1) {
                        System.out.print(channels[i]);
                    }
                }
            } else {
                System.out.print("Empty channel");
            }
            System.out.println("\nPrint 'close' for exit or print any other string to continue");
            closeTVProgramm = scanner.next();
        }
        while (!closeTVProgramm.contentEquals("close"));
    }
}
