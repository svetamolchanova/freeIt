package by.molchanova.lesson9.exceptions;

import java.io.*;

public class RunnerWithException
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis = new FileInputStream("exceptionalfile.file");
		}
		catch (FileNotFoundException exception)
		{
			try
			{
				throw new FileBadNameOrAbsentException("Наверное вы ошиблися");
			}
			catch (FileBadNameOrAbsentException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("File was found!");

	}
}
