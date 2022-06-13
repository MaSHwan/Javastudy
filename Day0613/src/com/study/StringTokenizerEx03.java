package com.study;
import java.util.*;
public class StringTokenizerEx03 {
public static void main(String[] args) {
	String str = "삶이 그대를 속일지라도 슬퍼하거나 노여워말라.";
	StringTokenizer st = new StringTokenizer(str , " ");
	
	for(int i = 0; st.hasMoreTokens(); i ++) {
		System.out.println(st.nextToken());
	}
}
}
