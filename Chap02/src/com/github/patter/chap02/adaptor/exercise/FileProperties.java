package com.github.patter.chap02.adaptor.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO{

	@Override
	public void readFromFile(String filename) throws IOException {
		// TODO Auto-generated method stub
		File file = new File(filename);
		FileInputStream fs = new FileInputStream(file);
//		InputStreamReader is = new InputStreamReader(fs);
		load(fs);
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		// TODO Auto-generated method stub
		File file = new File(filename);
		OutputStream os = new FileOutputStream(file);
//		OutputStreamWriter osw = new OutputStreamWriter(os);
//		
//		osw.write("#written by FileProperties\n");
//		osw.write("#시간은 모른다잉\n");
//		
//		Set<Object> set = keySet();
//		Iterator<Object> iter = set.iterator();
//		
//		while(iter.hasNext()) {
//			String str = (String)iter.next();
//			osw.write(str + " = " + getProperty(str) + "\n");
//		}
//		
//		osw.close();
//		os.close();
		store(os, "written by FileProperties");
	}

	@Override
	public void setValue(String key, String values) {
		// TODO Auto-generated method stub
		setProperty(key, values);
	}

	@Override
	public String getValue(String key) {
		// TODO Auto-generated method stub
		return getProperty(key);
	}
}
