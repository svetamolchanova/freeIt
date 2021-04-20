package by.molchanova.lesson10.input_output.fileInOut;

import java.io.*;
import java.util.*;

public class SimpleFileIOStream {
	public static void main(String[] args) throws IOException {

		FileOutputStream fos = null;
		
		try (FileInputStream fis = new FileInputStream("src\\by\\molchanova\\lesson10\\input_output\\fileInOut\\example.txt")){
		    fos = new FileOutputStream(new File("src\\by\\molchanova\\lesson10\\input_output\\fileInOut\\exampleoutput.txt"));
			int c;
			while((c = fis.read()) != -1) {
				fos.write(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			 try {
                 if (fos != null) fos.close();
             } catch (IOException e) {
			     e.printStackTrace();
             }
		}

        List<String> list = new ArrayList<>();
        System.out.println(list);
	}
}
