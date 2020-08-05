package com.example.calculate;

import java.util.List;

public interface Calculate {

	/**
	 * Makes the sum of two integers
	 *
	 * @param first  integer value
	 * @param second integer value
	 * @return Sum of two integer values
	 */
	int sum(int first, int second);

	/**
	 * Makes multiplication of two integers
	 *
	 * @param element element from array
	 * @param number  static number from console
	 * @return int result of multiplication
	 */
	int multiplicationWithNumber(int element, int number);

	/**
	 * Makes the sum of elements from lists
	 *
	 * @param first  list of integer values
	 * @param second list of integer values
	 * @return sum of two lists
	 */
	int arraysSum(List<Integer> first, List<Integer> second);

}