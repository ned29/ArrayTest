package com.example.util;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ReadFileTest {

	@Test
	public void testRead() {
		//when
		List<Integer> result = ReadFile.read("src/test/resources/test.csv");

		//then
		assertEquals(5, result.size());
		assertEquals(1, result.get(0));
		assertEquals(2, result.get(1));
		assertEquals(3, result.get(2));
		assertEquals(-9, result.get(3));
		assertEquals(23, result.get(4));
	}

	@Test
	public void testReadFailed() {
		//when
		NullPointerException e = assertThrows(NullPointerException.class, () -> ReadFile.read(null));

		//then
		assertNull(e.getMessage());
	}
}