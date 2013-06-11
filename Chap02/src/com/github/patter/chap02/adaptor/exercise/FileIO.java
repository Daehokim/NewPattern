package com.github.patter.chap02.adaptor.exercise;

import java.io.IOException;

public interface FileIO {
	public void readFromFile(String filename) throws IOException;
	public void writeToFile(String filename) throws IOException;
	public void setValue(String key, String values);
	public String getValue(String key);
}
