package org.example.template;

public class XMLDataRenderer extends DataRenderer {
    @Override
    public String readData() {
        return "XML data";
    }

    @Override
    public String processData(String data) {
        return "Processing " + data;
    }
}
