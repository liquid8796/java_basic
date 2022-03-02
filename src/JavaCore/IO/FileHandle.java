
package JavaCore.IO;

import java.io.File;
import java.io.FileFilter;

public class FileHandle {
    public static void main(String[] args) {
        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isHidden();
            }
        });
        for (File hiddenFile : hiddenFiles) {
            System.err.println(hiddenFile.getName());
        }
    }
}
