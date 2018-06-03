package application;

import java.io.File;
import java.util.Scanner;
import java.util.TreeMap;

public class TempList {

    TreeMap<String, Long> filesList = new TreeMap();

    public static void deleteFiles(TreeMap filesList) {


        System.out.print("Czy chcesz usunąc podane pliki Y/N");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.toUpperCase().equals("Y")) {
            System.out.println();
            System.out.println("Usuwam pliki:");
            String keys = (filesList.keySet()).toString();
            String[] arrayOfKeys = keys.split(", ");
            arrayOfKeys[0] = arrayOfKeys[0].substring(1);
            arrayOfKeys[arrayOfKeys.length - 1] = arrayOfKeys[arrayOfKeys.length - 1].
                    substring(0, (arrayOfKeys[arrayOfKeys.length - 1]).length() - 1);

            for (int i = 0; i < arrayOfKeys.length; i++) {
                File file = new File(arrayOfKeys[i]);
                System.out.println(file.delete());
                file.delete();
            }

        } else if (answer.toUpperCase().equals("N")) {
            System.out.println();
            System.out.println("Pliki nie zostaną usuniete");
        } else {
            System.out.println();
            System.out.println("Wpisano błędną odpowiedz !!! Wprowadz Y/N");
        }

    }


}

