package org.example.singleton;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DateUtil dateUtil1 = DateUtil.getInstance();
        DateUtil dateUtil2 = DateUtil.getInstance();
        System.out.println("dateUtil1: " + dateUtil1);
        System.out.println("dateUtil2: " + dateUtil2);
        System.out.println(dateUtil1 == dateUtil2);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DateUtil.ser"));
        oos.writeObject(dateUtil1);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./DateUtil.ser"));
        DateUtil dateUtil = (DateUtil) ois.readObject();
        System.out.println("After Deserialize dateUtil1: " + dateUtil);
    }
}
