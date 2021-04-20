package by.molchanova.lesson10.input_output.fileReaderWriter;

import java.io.*;

public class FileReaderWriterRunner {
	public static void main(String[] args) {
		try (FileReader fr = new FileReader("example.txt"); FileWriter fw = new FileWriter("exampleoutput2.txt")) {
			int a;
			while ((a = fr.read()) != -1) {
				fw.write(a);
				System.out.print((char)a);
			}

			BufferedReader br = new BufferedReader(fr);
			String res = br.readLine();
			while (res != null) {
				System.out.println(res);
				res = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
