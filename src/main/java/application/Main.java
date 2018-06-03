package application;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {

        File folder = new File("C:\\Users\\Komp-Mag\\Desktop\\Nowy folder (3)");

        FolderCheck folderCheck = new FolderCheck();
        TreeMap<String,Long>map= new TreeMap<>();

        Map<String, Long> result;
        result= folderCheck.checkFolders(map,folder);

        for(Map.Entry<String,Long> entry:result.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
