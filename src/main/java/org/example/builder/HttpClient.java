package org.example.builder;

public class HttpClient {
    private String url;
    private String method;
    private String body;
    private String username;
    private String password;

    public HttpClient(HttpClientBuilder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.body = builder.body;
        this.username = builder.username;
        this.password = builder.password;
    }

    public static HttpClientBuilder builder() {
        return new HttpClientBuilder();
    }

    static class HttpClientBuilder {
        private String url;
        private String method;
        private String body;
        private String username;
        private String password;

        public HttpClientBuilder body(String body) {
            this.body = body;
            return this;
        }

        public HttpClientBuilder method(String method) {
            this.method = method;
            return this;
        }

        public HttpClientBuilder password(String password) {
            this.password = password;
            return this;
        }

        public HttpClientBuilder url(String url) {
            this.url = url;
            return this;
        }

        public HttpClientBuilder username(String username) {
            this.username = username;
            return this;
        }

        public HttpClient build() {
            return new HttpClient(this);
        }
    }

    @Override
    public String toString() {
        return "HttpClient{" +
                "body='" + body + '\'' +
                ", url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
