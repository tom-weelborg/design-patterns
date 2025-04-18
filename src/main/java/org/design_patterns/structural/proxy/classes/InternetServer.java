package org.design_patterns.structural.proxy.classes;

public class InternetServer implements Server {
    @Override
    public void connectTo(final String host) {
        System.out.println("Opened connection to " + host);
    }
}
