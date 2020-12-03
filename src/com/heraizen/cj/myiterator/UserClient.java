package com.heraizen.cj.myiterator;

public class UserClient {
	public static void main(String[] arg) {
		UserList user = new UserList();
		MyIterator iterator = user.getIterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}

	}
}
