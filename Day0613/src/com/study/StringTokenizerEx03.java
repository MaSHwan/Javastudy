package com.study;
import java.util.*;
public class StringTokenizerEx03 {
public static void main(String[] args) {
	String str = "���� �״븦 �������� �����ϰų� �뿩������.";
	StringTokenizer st = new StringTokenizer(str , " ");
	
	for(int i = 0; st.hasMoreTokens(); i ++) {
		System.out.println(st.nextToken());
	}
}
}
