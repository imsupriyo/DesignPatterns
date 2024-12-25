package org.example.template;

public abstract class DataRenderer {
    public void render() {
        String data = readData();
        System.out.println(processData(data));
    }

    public abstract String readData();
    public abstract String processData(String data);

}
