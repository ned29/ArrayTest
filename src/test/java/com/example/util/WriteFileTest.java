package com.example.util;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class WriteFileTest {

	@Test
	public void testWrite() {
		//given
		List<String> result = Arrays.asList("1", "4", "5");

		//when
		WriteFile.write(result);

		//then
		File file = new File("src/main/resources/result.csv");
		assertTrue(file.exists());
	}
}