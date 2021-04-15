package by.molchanova.lesson9.exceptions;

import java.io.*;

public class FileBadNameOrAbsentException extends FileNotFoundException {

	private static final long serialVersionUID = 4336297326605895575L;
	
	public FileBadNameOrAbsentException() {
		super();
	}

	public FileBadNameOrAbsentException(String s) {
		super(s);
	}

	
}
