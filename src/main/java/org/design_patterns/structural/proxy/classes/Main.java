package org.design_patterns.structural.proxy.classes;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final String host = "ok.com";
        final String forbiddenHost = "forbidden.su";

        Server server = new InternetServer();
        server.connectTo(host);
        server.connectTo(forbiddenHost);

        server = new ProxyServer(List.of(forbiddenHost));
        server.connectTo(host);
        server.connectTo(forbiddenHost);
    }
}
