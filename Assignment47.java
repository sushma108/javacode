//Write a program to launch different browsers using Scanner class in switch Concept"
package Assignments;

import java.util.Scanner;

public class Assignment47 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a browser to launch:");
        System.out.println("1. Chrome");
        System.out.println("2. Firefox");
        System.out.println("3. Edge");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                launchBrowser("chrome");
                break;
            case 2:
                launchBrowser("firefox");
                break;
            case 3:
                launchBrowser("edge");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    private static void launchBrowser(String browser) {
        try {
            String os = System.getProperty("os.name").toLowerCase();

            String command;
            if (os.contains("win")) {
                command = "cmd /c start " + browser;
            } else if (os.contains("mac")) {
                command = "open -a " + browser;
            } else if (os.contains("nix") || os.contains("nux")) {
                command = browser;
            } else {
                System.out.println("Unsupported operating system.");
                return;
            }

            Runtime.getRuntime().exec(command);
        } catch (Exception e) {
            System.out.println("Error launching browser: " + e.getMessage());
        }
    }
}