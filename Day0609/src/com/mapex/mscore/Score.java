package com.mapex.mscore;

import java.io.IOException;
import java.io.*;
public interface Score {
// �߰�, ����, �˻�, ����, ��ü��� (�й���), ��ü���(����)
	
	public int insert() throws IOException;
	public int update() throws IOException;
	public int search() throws IOException;
	public int delete() throws IOException;
	public void writeAll();
	public void writeSort ();
	
}
