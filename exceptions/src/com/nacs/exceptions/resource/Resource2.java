package com.nacs.exceptions.resource;

public class Resource2 implements AutoCloseable {

	public void working() {
		System.out.println("Resource is Working");
	}
	@Override
	public void close() throws Exception {
		System.out.println("Resource1 is   Closed....");
		
	}

}
