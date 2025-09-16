package com.nacs.miniproject2.dao.impl;



import com.nacs.miniproject2.dao.StudentDao;
import com.nacs.miniproject2.entitie.Student;
import com.nacs.miniproject2.exceptions.InvalidStackIndexException;

public class StudentDaoImpl implements StudentDao {

    private int top;
    private Student[] studentsStack;

    public StudentDaoImpl() {
        top = -1;
        studentsStack = new Student[3];
    }

    @Override
    public String pushStudent(Student student) throws InvalidStackIndexException {
        try {
            top++;
            studentsStack[top] = student;
        } catch (ArrayIndexOutOfBoundsException e) {
            top--; // rollback
            throw new InvalidStackIndexException("Stack Overflow", e);
        }
        return "Student Data Pushed to Stack Successfully...";
    }

    @Override
    public String popStudent() throws InvalidStackIndexException {
        try {
            studentsStack[top] = null;
            top--;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new InvalidStackIndexException("Stack is Empty", e);
        }
        return "Student Data Popped from Stack Successfully...";
    }

    @Override
    public String printStack() {
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------------------------------------");
        for (int i = studentsStack.length - 1; i >= 0; i--) {
            sb.append("\n").append(studentsStack[i]).append("\n");
            sb.append("-------------------------------------------------");
        }
        return sb.toString();
    }
}

