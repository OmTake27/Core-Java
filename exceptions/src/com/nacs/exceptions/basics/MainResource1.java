package com.nacs.exceptions.basics;

import com.nacs.exceptions.resource.Resource1;
import com.nacs.exceptions.resource.Resource2;

public class MainResource1 {
	public static void main(String[] args) {
		try (Resource1 redource1 = new Resource1();) {
			redource1.working();

		}
		try (Resource2 redource2 = new Resource2();) {
			redource2.working();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

