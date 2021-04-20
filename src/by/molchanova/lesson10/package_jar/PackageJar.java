package by.molchanova.lesson10.package_jar;

import java.io.*;
import java.util.*;
import java.util.jar.*;
import java.util.zip.*;

public class PackageJar {
    private String fileName;
    private final int size = 2048;

    public PackageJar(String fileName) {
        this.fileName = fileName;
    }

    public void pack(String dirName) throws FileNotFoundException {
        File dir = new File(dirName);
        if (!dir.exists() || !dir.isDirectory()) {
            throw new FileNotFoundException(dir + " not found");
        }
        File[] files = dir.listFiles();
        List<String> listFilesToJar = new ArrayList<>();
        for (File file : files) {
            if (!file.isDirectory()) {
                listFilesToJar.add(file.getPath());
            }
        }
        System.out.println(listFilesToJar);
        //архивирование
        try (FileOutputStream fos = new FileOutputStream(fileName); JarOutputStream jos = new JarOutputStream(fos)) {
            byte[] buffer = new byte[size];
            jos.setLevel(Deflater.DEFAULT_COMPRESSION);
            for (String file : listFilesToJar) {
                jos.putNextEntry(new JarEntry(file));
                try (FileInputStream in = new FileInputStream(file)) {
                    int len;
                    while ((len = in.read(buffer)) > 0) {
                        jos.write(buffer, 0, len);
                    }
                    jos.closeEntry();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (IllegalArgumentException | IOException e) {
            e.printStackTrace();
        }
    }
}
