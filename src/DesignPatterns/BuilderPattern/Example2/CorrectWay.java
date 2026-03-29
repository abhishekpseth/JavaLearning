package DesignPatterns.BuilderPattern.Example2;

class URLBuilder {
    private final String protocol;
    private final String hostname;
    private final String port;
    private final String pathParam;
    private final String queryParam;

    private URLBuilder(Builder builder) {
        this.protocol = builder.protocol;
        this.hostname = builder.hostname;
        this.port = builder.port;
        this.pathParam = builder.pathParam;
        this.queryParam = builder.queryParam;
    }

    public static class Builder {
        private final String protocol;
        private final String hostname;
        private String port = "";
        private String pathParam = "";
        private String queryParam = "";

        public Builder(String protocol, String hostname) {
            this.protocol = protocol;
            this.hostname = hostname;
        }

        public Builder port(String port) {
            this.port = port;
            return this;
        }

        public Builder pathParam(String pathParam) {
            this.pathParam = pathParam;
            return this;
        }

        public Builder queryParam(String queryParam) {
            this.queryParam = queryParam;
            return this;
        }

        public URLBuilder build() {
            return new URLBuilder(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder url = new StringBuilder();
        url.append(protocol).append(hostname);
        if (!port.isEmpty()) {
            url.append(port);
        }
        if (!pathParam.isEmpty()) {
            url.append(pathParam);
        }
        if (!queryParam.isEmpty()) {
            url.append(queryParam);
        }
        return url.toString();
    }
}

public class CorrectWay {
    public static void main(String[] args) {
        URLBuilder url1 = new URLBuilder.Builder("https://", "myWebsite")
                .port(":8080")
                .pathParam("/companies")
                .queryParam("/companyName=xyz")
                .build();

        System.out.println("Final URL: " + url1);

        // in easier way

        URLBuilder.Builder builder = new URLBuilder.Builder("https://", "myWebsite");
        URLBuilder url2 =  builder.port(":8080").pathParam("/companies").queryParam("/companyName=xyz").build();

        System.out.println("Final URL: "+ url2);
    }
}

