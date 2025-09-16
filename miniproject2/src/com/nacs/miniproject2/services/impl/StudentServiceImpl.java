package com.nacs.miniproject2.services.impl;

import com.nacs.miniproject2.dao.StudentDao;
import com.nacs.miniproject2.dao.impl.StudentDaoImpl;
import com.nacs.miniproject2.entitie.Student;
import com.nacs.miniproject2.exceptions.*;
import com.nacs.miniproject2.services.StudentService;

public class StudentServiceImpl implements StudentService {

    private StudentDao dao = new StudentDaoImpl();

    @Override
    public String pushStudent(Student student) 
            throws InvalidRollNoException, InvalidAgeException, InvalidNameException, InvalidStackIndexException {
        if (isValid(student)) {
            return dao.pushStudent(student);
        } else {
            return "Invalid Student Data Input..";
        }
    }

    // ✅ Simplified Validation
    private boolean isValid(Student student) 
            throws InvalidRollNoException, InvalidAgeException, InvalidNameException {

        // Roll No: must be greater than 0
        if (student.getRollNo() <= 0) {
            throw new InvalidRollNoException("Roll No must be greater than 0");
        }

        // Name: not null/empty, only letters and spaces
        String name = student.getName();
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidNameException("Name cannot be empty");
        }
        if (!name.matches("^[A-Za-z ]+$")) {
            throw new InvalidNameException("Name must only contain alphabets and spaces");
        }

        // Age: must be 15 or above
        if (student.getAge() < 15) {
            throw new InvalidAgeException("Age must be 15 or above");
        }

        return true;
    }

    @Override
    public String popStudent() throws InvalidStackIndexException {
        return dao.popStudent();
    }

    @Override
    public String printStack() {
        return dao.printStack();
    }
}
