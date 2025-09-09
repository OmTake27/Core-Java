package com.nacs.oops.polymorphism;

public class SubMethodOverriding extends MethodOverridingDemo {
	

    @Override
    protected SubMethodOverriding printData(String data) {
        System.out.println("Sub Class " + data);
        //thread.sleep;
        return new SubMethodOverriding();
    }
}
