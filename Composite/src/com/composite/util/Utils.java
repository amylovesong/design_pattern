package com.composite.util;

public class Utils {
	/**
	 * create a string that composed with char c, the length of the string is
	 * count
	 * 
	 * @param c
	 *            the char
	 * @param count
	 *            the length of return string
	 * @return
	 */
	//
	public static String createString(char c, int count) {
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < count; i++) {
			s.append(c);
		}

		return s.toString();
	}
}
