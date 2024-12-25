package org.example.builder;

public class Test {
    public static void main(String[] args) {
        HttpClient httpClient = HttpClient.builder()
                .url("https://www.baidu.com")
                .method("get")
                .body("body")
                .build();
        System.out.println(httpClient);
    }
}
