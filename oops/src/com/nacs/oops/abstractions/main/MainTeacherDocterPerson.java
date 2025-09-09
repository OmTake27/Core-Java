package com.nacs.oops.abstractions.main;

import com.nacs.oops.abstractions.Person;
import com.nacs.oops.abstractions.impl.Doctor;
import com.nacs.oops.abstractions.impl.Teacher;

public class MainTeacherDocterPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person jagdaleMam = new Teacher();
		jagdaleMam.DefineMe();
		
		Person Take=new Doctor();
		Take.DefineMe();
		

	}

}
