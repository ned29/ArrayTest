package com.example;

import com.example.calculate.Calculation;
import com.example.util.ReadFile;
import com.example.util.WriteFile;

import java.util.List;
import java.util.Scanner;

public class Application {

	private static final String TEXT_FOR_FIRST_INPUT = "Please enter path to csv file  Example -->/Users/ned29/Desktop/test.csv";
	private static final String TEXT_FOR_NUMBER = "Please enter number for multiplication by default 0";
	private static final String TEXT_FOR_SECOND_INPUT = "Please enter path to second csv file or just press enter to continue";

	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		String path;
		int number;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println(TEXT_FOR_FIRST_INPUT);
			path = scanner.nextLine();
		} while (path.isEmpty());
		System.out.println(TEXT_FOR_NUMBER);
		number = Integer.parseInt(scanner.nextLine());
		List<Integer> numbers = ReadFile.read(path);
		List<String> result = calculation.processData(numbers, number);
		System.out.println(TEXT_FOR_SECOND_INPUT);
		String pathSecond = scanner.nextLine();
		if (pathSecond != null && !pathSecond.isEmpty()) {
			List<Integer> numbersSecond = ReadFile.read(pathSecond);
			int sum = calculation.arraysSum(numbers, numbersSecond);
			result.add(String.valueOf(sum));
		}
		WriteFile.write(result);
		System.out.println(result);
		System.out.println("Done");
	}
}
