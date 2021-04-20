package by.molchanova.lesson10.input_output.fileInOut;

import java.io.*;

public class FISServiceExample {

	public static byte[] readAllBytesFromFile(String fileLocation) throws IOException {
		File file = new File(fileLocation);
        byte[] byteArray = null;

		try (FileInputStream fis = new FileInputStream(file)) {
            byteArray = new byte[fis.available()];

            for (int i = 0; i < byteArray.length; i++) byteArray[i] = (byte) fis.read();
        }
		return byteArray;
	}
}
