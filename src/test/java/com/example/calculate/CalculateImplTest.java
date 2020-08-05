package com.example.calculate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CalculateImplTest {

	private final Calculate calculate = new CalculateImpl();

	@ParameterizedTest
	@CsvSource({ "1,2,3", "2,-4,-2", "-10,67,57" })
	public void testSum(int first, int second, int result) {
		//when
		int res = calculate.sum(first, second);

		//then
		assertEquals(res, result);
	}

	@ParameterizedTest
	@MethodSource("arraysProvider")
	public void testArraysSum(List<Integer> first, List<Integer> second, int res) {
		//when
		int result = calculate.arraysSum(first, second);

		//then
		assertEquals(res, result);
	}

	@ParameterizedTest
	@CsvSource({ "1,2,2", "2,-4,-8", "-10,67,-670" })
	public void testMultiplicationWithNumber(int element, int number, int res) {
		//when
		int result = calculate.multiplicationWithNumber(element, number);

		//then
		assertEquals(result, res);
	}

	private static Stream<Arguments> arraysProvider() {
		return Stream.of(arguments(new ArrayList<>(Arrays.asList(4, -8, 34)), new ArrayList<>(Arrays.asList(47, 1, -78)), 0),
				arguments(new ArrayList<>(Arrays.asList(100, -56, 0)), new ArrayList<>(Arrays.asList(56, -67)), 33),
				arguments(new ArrayList<>(Arrays.asList(100, -56, 0)), Collections.EMPTY_LIST, 44),
				arguments(Collections.EMPTY_LIST, Collections.EMPTY_LIST, 0));
	}
}