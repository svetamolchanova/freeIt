package by.molchanova.lesson10.package_jar;

import java.io.*;

public class Runner {

    public static void main(String[] args) {
        String dirName = "src\\by\\molchanova\\lesson10\\files";
        PackageJar packageJar = new PackageJar("example.jar");
        try {
            packageJar.pack(dirName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
