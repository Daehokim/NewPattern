package com.github.patter.chap02.adaptor.exercise;

import java.io.IOException;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileIO f = new FileProperties();
		try {
			f.readFromFile("file.txt");
			f.setValue("year", "2004");
			f.setValue("month", "4");
			f.setValue("day", "24");
			f.writeToFile("newFile.txt");
		} catch (IOException e) {
			e.toString();
		}
	}
}
