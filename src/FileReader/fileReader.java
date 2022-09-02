//Create an instance of File Input Stream with the file path.
//Create a byte array of the same length as the file.
//Read that file content to an array.
//Print the byte array.

//lose the instance of the file input stream as it is a good practice 
//in order to avoid any exception or error being faced during runtime 
//and to release the memory resources making our program optimized leading to faster execution.
package FileReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

public class fileReader {
    private static void readFileToBytes(String filePath) throws IOException {

        File file = new File(filePath);
        byte[] bytes = new byte[(int) file.length()];

        FileInputStream fis = null;
        try {

            fis = new FileInputStream(file);

            // read file into bytes[]
            fis.read(bytes);

        } finally {
            if (fis != null) {
                fis.close();
            }
        }

    }

}
