package org.study.listener;

public class OnlineCounter {
	private static long counter = 0;
	
	public static void increase() {
		++counter;
	}
	
	public static void decrease() {
		--counter;
	}
	
	public static long getCounter() {
		return counter;
	}
}
