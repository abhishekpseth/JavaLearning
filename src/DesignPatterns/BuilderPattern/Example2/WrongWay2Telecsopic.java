package DesignPatterns.BuilderPattern.Example2;

// create a URL Builder

// Protocol:  https
// Hostname: mywebsite
// Port: 8080 (OPTIONAL)
// Path Param: companies (OPTIONAL)
// Query Param: ?companyName=xyz (OPTIONAL)

// final URL-> https://mywebsite:8080/companies?companyName=xyz

class URL2 {
    String protocol;
    String hostname;
    String port;
    String pathParam;
    String queryParam;

    URL2(String protocol){
        this.protocol = protocol;
    }

    URL2(String protocol, String hostname){
        this(protocol);
        this.hostname = hostname;
    }

    URL2(String protocol, String hostname, String port){
        this(protocol, hostname);
        this.port = port;
    }

    URL2(String protocol, String hostname, String port, String pathParam){
        this(protocol, hostname, port);
        this.pathParam = pathParam;
    }

    URL2(String protocol, String hostname, String port, String pathParam, String queryParam){
        this(protocol, hostname, port, pathParam);
        this.queryParam = queryParam;
    }
}

public class WrongWay2Telecsopic {
    // telescopic one solves a problem to a bit but doesn't solve problem of having multiple permutations of parameters
}
