package org.design_patterns.structural.adapter.classes.adaptees;

import java.util.List;

public class XmlTextData extends XmlData {
    private final String text;

    public XmlTextData(final String text) {
        super("text", List.of());
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
