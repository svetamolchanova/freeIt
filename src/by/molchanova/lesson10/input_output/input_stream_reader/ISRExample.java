package by.molchanova.lesson10.input_output.input_stream_reader;

import java.io.*;
import java.util.*;

public class ISRExample {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = null;

		try {
			isr = new InputStreamReader(System.in);
			System.out.println("type something...");
            Scanner scanner = new Scanner(isr);
			char ch;
			do {
				ch = (char) isr.read();
				System.out.print(ch + " ");
			} while (ch != 'q');
		}finally {
			if(isr != null) {
				isr.close();
				System.out.println("Program finished!");
			}
		}

	}
}
