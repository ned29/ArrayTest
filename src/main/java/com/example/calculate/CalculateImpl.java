package com.example.calculate;

import java.util.List;

public class CalculateImpl implements Calculate {

	@Override
	public int sum(int first, int second) {
		return first + second;
	}

	@Override
	public int multiplicationWithNumber(int element, int number) {
		return element * number;
	}

	@Override
	public int arraysSum(List<Integer> first, List<Integer> second) {
		first.addAll(second);
		return first.stream().reduce(this::sum).orElse(0);
	}
}