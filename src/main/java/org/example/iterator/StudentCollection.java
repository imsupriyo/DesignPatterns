package org.example.iterator;

public class StudentCollection implements Collection {
    int noOfStudents = 0;
    Student[] students;

    public StudentCollection() {
        this.students = new Student[10];
    }

    void addStudent(Student student) {
        students[noOfStudents++] = student;
    }

    @Override
    public Iterator createIterator() {
        return new Iterator(students);
    }

}
