package com.test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class comparator {

	public static void main(String[] args) {

			List<String> names = Arrays.asList("JAVA", "SQL", "R", "PYTHON");
			names.sort (Comparator.comparingInt(str->str.length()));
			names.forEach (str->System.out.println(str));
	}
}


