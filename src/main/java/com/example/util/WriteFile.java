package com.example.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class WriteFile {

	private static final Logger LOGGER = LoggerFactory.getLogger(WriteFile.class);
	private static final String PATH_TO_SAVE = "src/main/resources/result.csv";

	private WriteFile() {
	}

	public static void write(List<String> result) {
		try (PrintWriter writer = new PrintWriter(new File(PATH_TO_SAVE))) {
			StringBuilder sb = new StringBuilder();
			result.forEach(res -> {
				sb.append(res);
				sb.append('\n');
			});
			writer.write(sb.toString());
		} catch (FileNotFoundException e) {
			LOGGER.error(e.getMessage());
		}
	}
}
