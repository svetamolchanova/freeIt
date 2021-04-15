package by.molchanova.lesson9.exceptions;

public class ArrayIndexException extends Exception {

	long exceptionTime;

	public ArrayIndexException(String message) {
		super(message);
	}

	public ArrayIndexException(long exceptionTime, String message) {
		super(message);
		this.exceptionTime = exceptionTime;
	}

	public long getExceptionTime() {
		return exceptionTime;
	}

	public void setExceptionTime(long exceptionTime) {
		this.exceptionTime = exceptionTime;
	}
	
}

