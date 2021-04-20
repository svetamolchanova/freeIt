package by.molchanova.lesson10.input_output.fileInOut;

import java.io.*;

public class FISExample {

	private FileInputStream fis;
	
	private FISExample(FileInputStream fis) {
		super();
		this.fis = fis;
	}

	private static volatile FISExample instance;

	public static FISExample getInstance(File file) throws FileNotFoundException {
		if (instance == null) {
			synchronized (FISExample.class) {
				if (instance == null) {
					FileInputStream fis = new FileInputStream(file);//Here could be an exception
					instance = new FISExample(fis);
				}
			}
		}
		return instance;
	}

	public FileInputStream getFis() {
		return fis;
	}

	public void setFis(FileInputStream fis) {
		this.fis = fis;
	}

}
