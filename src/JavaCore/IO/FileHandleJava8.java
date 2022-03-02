
package JavaCore.IO;

import java.io.File;

public class FileHandleJava8 {
    public static void main(String[] args) {
        File[] hiddenFiles = new File(".").listFiles(File::isHidden);
        for (File hiddenFile : hiddenFiles) {
            System.err.println(hiddenFile.getName());
        }
    }
}
