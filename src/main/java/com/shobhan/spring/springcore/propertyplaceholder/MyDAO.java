package com.shobhan.spring.springcore.propertyplaceholder;

public class MyDAO {
	private String dbServer;

	public MyDAO(String dbServer) {
		this.dbServer = dbServer;
	}

	public String getDbServer() {
		return dbServer;
	}

	public void setDbServer(String dbServer) {
		this.dbServer = dbServer;
	}

}
