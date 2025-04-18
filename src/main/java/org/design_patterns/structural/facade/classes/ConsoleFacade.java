package org.design_patterns.structural.facade.classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleFacade {
    public void print(final Object object) {
        print(object.toString());
    }

    public void print(final String text) {
        System.out.print(text);
    }

    public void println(final Object object) {
        println(object.toString());
    }

    public void println(final String text) {
        System.out.println(text);
    }

    public String readString() {
        try {
            final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return reader.readLine();
        } catch (final IOException e) {
            return "";
        }
    }

    public int readInt() {
        return Integer.parseInt(readString());
    }
}
