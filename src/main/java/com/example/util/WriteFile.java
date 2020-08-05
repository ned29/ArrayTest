package com.example.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class WriteFile {

	private WriteFile() {
	}

	public static void write(List<String> result) {
		try (PrintWriter writer = new PrintWriter(new File("src/main/resources/result.csv"))) {
			StringBuilder sb = new StringBuilder();
			result.forEach(res -> {
				sb.append(res);
				sb.append('\n');
			});
			writer.write(sb.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
