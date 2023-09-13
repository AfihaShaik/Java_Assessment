package com.Functional;
import java.util.Arrays;
import java.util.List;
public class MapFilterReduce {
	   public static void main(String[] args) {
	       List<String> stringList = Arrays.asList("java", "python", "parallel", "database", "interface");

	       String result = stringList.stream()
	               .map(String::toUpperCase) // Convert to uppercase
	               .filter(s -> s.length() >= 4) // Filter strings with 4 or more characters
	               .reduce("", (partialResult, str) -> partialResult + str); // Concatenate using reduce

	       System.out.println(result);
	   }
	}
