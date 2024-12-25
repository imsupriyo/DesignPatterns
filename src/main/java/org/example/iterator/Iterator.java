package org.example.iterator;

public class Iterator {
    private final Student[] students;
    private int index = 0;

    public Iterator(Student[] students) {
        this.students = students;
    }

    public boolean hasNext() {
        return index < students.length && students[index] != null;
    }

    public Student next() {
        return students[index++];
    }
}
