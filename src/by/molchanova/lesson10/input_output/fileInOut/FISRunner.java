package by.molchanova.lesson10.input_output.fileInOut;

import java.io.*;

public class FISRunner {

	public static void main(String[] args) throws IOException {
		try (FileOutputStream fos = new FileOutputStream("example-copy.txt")) {
			
			byte[] byteArray = FISServiceExample.readAllBytesFromFile("example.txt");
			
			fos.write(byteArray);

            for (byte b : byteArray) {
                System.out.print(b + ", ");
            }
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
