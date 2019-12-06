package utils;

public class idGenerator {
	private static int AccountID = 0;
	
	public static int getAccountID() {
		return ++AccountID;
	}

}
