package org.design_patterns.structural.adapter.classes.adapters;

import org.design_patterns.structural.adapter.classes.adaptees.XmlData;
import org.design_patterns.structural.adapter.classes.adaptees.XmlTextData;
import org.design_patterns.structural.adapter.classes.targets.IJsonData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XmlToJsonAdapter implements IJsonData {
    private final XmlData xmlData;

    public XmlToJsonAdapter(final XmlData xmlData) {
        this.xmlData = xmlData;
    }

    @Override
    public Map<String, Object> getJsonData() {
        final Map<String, Object> jsonData = new HashMap<>();
        final String key = xmlData.getTagName();
        final Object value;
        if (xmlData instanceof XmlTextData xmlTextData) {
            value = xmlTextData.getText();
        } else {
            value = getChildJson();
        }
        jsonData.put(key, value);
        return jsonData;
    }

    private List<Map<String, Object>> getChildJson() {
        final List<Map<String, Object>> childJsons = new ArrayList<>();
        for (final XmlData child : xmlData.getChildren()) {
            final XmlToJsonAdapter xmlToJsonAdapter = new XmlToJsonAdapter(child);
            childJsons.add(xmlToJsonAdapter.getJsonData());
        }
        return childJsons;
    }
}
