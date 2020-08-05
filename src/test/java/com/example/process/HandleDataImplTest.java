package com.example.process;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class HandleDataImplTest {

	private final HandleDataImpl handleDataImpl = new HandleDataImpl();

	@ParameterizedTest
	@MethodSource("arraysProvider")
	public void testProcessData(List<Integer> numbers, int number, List<String> res) {
		//when
		List<String> result = handleDataImpl.processData(numbers, number);

		//then
		assertEquals(res.get(0), result.get(0));
		assertEquals(res.get(1), result.get(1));
		assertEquals(res.get(2), result.get(2));
	}

	private static Stream<Arguments> arraysProvider() {
		return Stream
				.of(arguments(new ArrayList<>(Arrays.asList(4, -8, 34)), 0, Arrays.asList("30", "[0, 0, 0]", "[-8, 4, 34]")),
						arguments(new ArrayList<>(Arrays.asList(100, -56, 0)), 33,
								Arrays.asList("44", "[3300, -1848, 0]", "[-56, 0, 100]")));
	}
}