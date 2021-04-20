package by.molchanova.lesson10.input_output.data_isos;

import java.io.*;

public class DataInputOutputExample {
	public static void main(String[] args) throws IOException {
		
		DataOutputStream dataOutput = new DataOutputStream(new FileOutputStream("datafile.txt", true));
		StringBuffer br = new StringBuffer();

		for (int i = 0; i < 4; i++) {
			dataOutput.writeInt((int) (Math.random() * 100));
			dataOutput.writeDouble(Math.random() * 100);
			dataOutput.writeUTF("Тест " + i);
			dataOutput.writeBoolean(true);
		}
		dataOutput.close();

		DataInputStream dataInput = new DataInputStream(new BufferedInputStream(new FileInputStream("datafile.txt")));
		while (dataInput.available() > 0) {
			int first = dataInput.readInt();
			double second = dataInput.readDouble();
			String third = dataInput.readUTF();
			boolean fourth = dataInput.readBoolean();

			System.out.println(first + " " + second + " " + third + " " + fourth);
		}

		dataInput.close();


		System.out.println("Test text \n Тест текст");

	}
}
