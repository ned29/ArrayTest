package com.example.calculate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Calculation {

	private final Calculate calculate = new CalculateImpl();

	public List<String> processData(List<Integer> numbers, int staticNumber) {
		if (numbers != null && !numbers.isEmpty()) {
			List<String> result = new ArrayList<>();
			int sum = numbers.stream().reduce(calculate::sum).orElse(0);
			List<Integer> multiplication = numbers.stream()
					.map(number -> calculate.multiplicationWithNumber(number, staticNumber)).collect(Collectors.toList());
			Collections.sort(numbers);
			result.add(String.valueOf(sum));
			result.add(multiplication.toString());
			result.add(numbers.toString());
			return result;
		}
		return new ArrayList<>();
	}

	public int arraysSum(List<Integer> first, List<Integer> second) {
		return calculate.arraysSum(first, second);
	}
}
