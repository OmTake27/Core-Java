package com.nacs.logicalprograms;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte age = 21;
		if (age > 17)
			System.out.println("Candidate is Illegible for Voting");
		 int number=1000;
		 if(number%2==0)
			 System.out.println(number+" is a even number");
		 else 
			 System.out.println(number+" is a odd number");
        byte mark=73;
        char grade='f';
        if(mark>=90) 
        	grade='A';
        else if(mark>=80)
        	grade='B';
        else if(mark>=70)
        	grade='C';
        else if(mark>=60)
        	grade='D';
        else if(mark>=50)
        	grade='E';
        else
        	grade='f';
        System.out.println(grade);
	}

}
