package com.ioex;

import java.io.*;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("c:/ppp/fileout.txt");
			String message = "æ»≥Á«œººø‰ !!!";
			fos.write(message.getBytes());
			fos.close();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException ii) {
				ii.printStackTrace();
			}
		}
	}
}
