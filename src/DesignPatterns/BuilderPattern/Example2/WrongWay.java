package DesignPatterns.BuilderPattern.Example2;

// create a URL Builder

// Protocol:  https
// Hostname: mywebsite
// Port: 8080 (OPTIONAL)
// Path Param: companies (OPTIONAL)
// Query Param: ?companyName=xyz (OPTIONAL)

// final URL-> https://mywebsite:8080/companies?companyName=xyz

class URL {
    String protocol;
    String hostname;
    String port;
    String pathParam;
    String queryParam;

    URL(String protocol){
        this.protocol = protocol;
    }

    URL(String protocol, String hostname){
        this.protocol = protocol;
        this.hostname = hostname;
    }

    URL(String protocol, String hostname, String port){
        this.protocol = protocol;
        this.hostname = hostname;
        this.port = port;
    }

    URL(String protocol, String hostname, String port, String pathParam){
        this.protocol = protocol;
        this.hostname = hostname;
        this.port = port;
        this.pathParam = pathParam;
    }

    URL(String protocol, String hostname, String port, String pathParam, String queryParam){
        this.protocol = protocol;
        this.hostname = hostname;
        this.port = port;
        this.pathParam = pathParam;
        this.queryParam = queryParam;
    }
}

public class WrongWay {
    // creating different constructors for different needs
}
