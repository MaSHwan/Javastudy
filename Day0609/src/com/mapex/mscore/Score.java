package com.mapex.mscore;

import java.io.IOException;
import java.io.*;
public interface Score {
// 추가, 수정, 검색, 삭제, 전체출력 (학번순), 전체출력(정렬)
	
	public int insert() throws IOException;
	public int update() throws IOException;
	public int search() throws IOException;
	public int delete() throws IOException;
	public void writeAll();
	public void writeSort ();
	
}
