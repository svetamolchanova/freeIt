package by.molchanova.lesson10.files;

import java.io.*;
import java.nio.file.*;

public class FileRunner {
	public static void main(String[] args) throws IOException {

	    String path = "src" + File.separator + " by molchanova lesson10 files example.txt";
		File file = new File("src\\by\\molchanova\\lesson10\\files\\example.txt");
		//System.out.println(file.createNewFile());

		//file.mkdirs();
//
//		String absolutePath = file.getAbsolutePath();
//        System.out.println(absolutePath);
//		boolean isFile = file.isFile();
//
//		System.out.println(file.exists());
//		System.out.println(isFile);
//        System.out.println("********************");
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getCanonicalPath());
//		System.out.println(file.canWrite());
//
//		File file2 = new File("src\\lesson7");
//		boolean isDirectory = file2.isDirectory();
//		String path = file2.getPath();
//
//		System.out.println(isDirectory);
//		Arrays.asList(file2.listFiles()).forEach(System.out::println);
//
		File file3 = new File("src\\by\\molchanova\\lesson10\\files\\renamed.txt");
        System.out.println(file3.createNewFile());
        System.out.println(file3.renameTo(new File("src\\by\\molchanova\\lesson10\\files\\renamed2.txt")));
        //System.out.println(file3.delete());

//		System.out.println();


	}
}
