package by.molchanova.lesson10.input_output.byte_array_isos;

import java.io.*;

public class ByteArrayInputStreamExample {

    public static void main(String[] args) throws IOException {

        byte[] byteArray = "This is string to byte array example".getBytes();

        for (int i = 0; i < byteArray.length; i++) {
            System.out.println(byteArray[i]);
        }
        try (ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            BufferedOutputStream buf = new BufferedOutputStream(baos);
            int a;

            while ((a = bais.read()) != -1) {
                baos.write(a);
            }
            byte[] outputByteArray = baos.toByteArray();

            for (int i = 0; i < outputByteArray.length; i++) {
                System.out.print((char) outputByteArray[i]);
            }
        }
    }
}
