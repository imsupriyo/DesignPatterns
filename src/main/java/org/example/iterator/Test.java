package org.example.iterator;

public class Test {
    public static void main(String[] args) {
        StudentCollection studentCollection = new StudentCollection();
        studentCollection.addStudent(new Student(22, 1, "Supriyo"));
        studentCollection.addStudent(new Student(23, 2, "Pappu"));

        Iterator iterator = studentCollection.createIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }
    }
}
