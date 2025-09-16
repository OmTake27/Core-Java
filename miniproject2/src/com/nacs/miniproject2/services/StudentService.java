package com.nacs.miniproject2.services;




import com.nacs.miniproject2.entitie.Student;
import com.nacs.miniproject2.exceptions.*;

public interface StudentService {
    String pushStudent(Student student) throws InvalidStackIndexException, InvalidRollNoException, InvalidAgeException, InvalidNameException;
    String popStudent() throws InvalidStackIndexException;
    String printStack();
}

