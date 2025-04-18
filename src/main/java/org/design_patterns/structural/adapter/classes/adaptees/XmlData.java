package org.design_patterns.structural.adapter.classes.adaptees;

import java.util.List;

public class XmlData {
    private final String tagName;
    private final List<XmlData> children;

    public XmlData(final String tagName, final List<XmlData> children) {
        this.tagName = tagName;
        this.children = children;
    }

    public String getTagName() {
        return tagName;
    }

    public List<XmlData> getChildren() {
        return children;
    }
}
