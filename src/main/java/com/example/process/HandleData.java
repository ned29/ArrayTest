package com.example.process;

import java.util.List;

public interface HandleData {

	/**
	 * Makes sum, multiplication and sort for numbers list
	 *
	 * @param numbers      list of integers
	 * @param staticNumber int for multiplication
	 * @return list with results of sum, multiplication and sort
	 */
	List<String> processData(List<Integer> numbers, int staticNumber);

	/**
	 * Layer for communication
	 */
	int arraysSum(List<Integer> first, List<Integer> second);
}
