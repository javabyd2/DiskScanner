package application.insertpath;

public class PathChanger {

    public String pathToFile(String path) {

        char temporaryBank;
        String change = "\\";

        for (int i = 0; i < path.length(); i++) {

            temporaryBank = path.charAt(i);

            if (temporaryBank == '\\') {
                path = (path.substring(0, (i)) + change + path.substring((i), path.length()));
                i++;
            }
        }

        return path;
    }
}
