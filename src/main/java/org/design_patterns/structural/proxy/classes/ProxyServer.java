package org.design_patterns.structural.proxy.classes;

import java.util.List;

public class ProxyServer implements Server {
    private final List<String> forbiddenHosts;
    private final Server server;

    public ProxyServer(final List<String> forbiddenHosts) {
        this.forbiddenHosts = forbiddenHosts;
        this.server = new InternetServer();
    }

    @Override
    public void connectTo(final String host) {
        if (forbiddenHosts.contains(host)) {
            throw new IllegalArgumentException("You may not access this host!");
        }
        this.server.connectTo(host);
    }
}
