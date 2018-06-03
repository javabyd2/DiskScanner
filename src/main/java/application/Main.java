package application;

import application.insertpath.PathChanger;
import application.insertpath.PathReader;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Podaj sciezke do pliku: ");

        PathReader pathReader = new PathReader();
        PathChanger pathChanger = new PathChanger();

        Scanner scanner = new Scanner(System.in);

        pathReader.setPathFromUser(scanner.nextLine());
        pathReader.setNewPathFromUser(pathChanger.pathToFile(pathReader.getPathFromUser()));

        File currentFolder = new File(pathReader.getNewPathFromUser());

    }
}
