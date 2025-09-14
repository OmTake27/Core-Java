package com.nacs.exceptions.resource;

public class Resource1 implements AutoCloseable{
	public void working() {
		System.out.println("Resource is Working");
	}

	@Override
	public void close()  {
		System.out.println("Resource1 is   Closed....");
		
	}

}
