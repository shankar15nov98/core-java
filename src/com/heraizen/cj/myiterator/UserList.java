package com.heraizen.cj.myiterator;

public class UserList {

	private String[] names;

	public UserList() {
		names = "Shankar,Santhosh,Shiva,Sanjay,vVijay,Surya,Ajith,Vikram,Kamal,Rahul".split(",");
	}

	MyIterator getIterator() {
		return new X();

	}

	class X implements MyIterator {
		int count = 0;

		@Override
		public boolean hasNext() {

			return count < names.length;
		}

		@Override
		public String next() {

			if (count >= names.length) {
				throw new ArrayIndexOutOfBoundsException("Try to access valid index");
			}

			return names[count++];

		}
	}
}
