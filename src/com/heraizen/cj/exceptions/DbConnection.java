package com.heraizen.cj.exceptions;

public class DbConnection {
	static int count = 0;
	static String dbName;
	public static void getObject() {

		
		System.out.println(dbName+" Database connected Successfully  ");

	}

	private DbConnection(String dbName) {
		this.dbName = dbName;
		
	}

	{
		count++;
	}

	public static void main(String[] arg) throws Exception {

		DbConnection db1 = new DbConnection("Sql");
		db1.getObject();
		
		DbConnection db2 = new DbConnection("sql");
		db2.getObject();
		try {

			if (count > 1)

			{
				
				throw new Exception("Allows to create only single object");
			}

		} catch (Exception e) {
			System.out.println(e);

		}

	}
}
