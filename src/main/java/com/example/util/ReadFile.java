package com.example.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFile {

	private static final Logger LOGGER = LoggerFactory.getLogger(ReadFile.class);
	private static final String COMA = ",";

	private ReadFile() {
	}

	public static List<Integer> read(String csvFile) {
		String line = "";
		String[] numbers = new String[] {};
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			while ((line = br.readLine()) != null) {
				numbers = line.split(COMA);
			}
			return Arrays.stream(numbers).map(Integer::valueOf).collect(Collectors.toList());
		} catch (IOException e) {
			LOGGER.error(e.getMessage());
		}
		return new ArrayList<>();
	}
}
