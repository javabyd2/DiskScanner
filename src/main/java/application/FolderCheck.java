package application;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class FolderCheck {

    public Map<String, Long> checkFolders(TreeMap<String, Long> checkerResult, File folder) throws IOException {

        File[] myFileList = folder.listFiles();

        Date lastMonth= new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(lastMonth);
        cal.add(Calendar.MONTH, -1);
        lastMonth = cal.getTime();

        long sizeInMB;

        for (File name : myFileList) {

            sizeInMB=name.length()/1024/1024;

            if (name.isDirectory()) {
                checkFolders(checkerResult, name);
            } else {
                if (((sizeInMB>10)&&(new Date(name.lastModified()).before(lastMonth)))) {
                    checkerResult.put(name.getPath()+" "+new Date(name.lastModified()), sizeInMB);
                    //System.out.println(name.toPath() + " File name: " + name.getName() + " " + new Date(name.lastModified()) + " size is: " + sizeInMB+" MB");
                }
            }
        }
        return SortingHelper.sortByValue(checkerResult);
    }
}
