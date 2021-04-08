package by.molchanova.lesson7.generic;

import java.util.*;

public class Generic <T extends Number> {

	private T generic;

	public Generic(T t) {
		super();
		this.generic = t;
	}

	public T getGeneric() {
		return generic;
	}

	List<String> list = new ArrayList<>();
}

