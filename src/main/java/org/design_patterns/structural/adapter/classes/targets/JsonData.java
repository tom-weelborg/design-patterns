package org.design_patterns.structural.adapter.classes.targets;

import java.util.HashMap;
import java.util.Map;

public class JsonData implements IJsonData {
    private final Map<String, Object> data = new HashMap<>();

    @Override
    public Map<String, Object> getJsonData() {
        return this.data;
    }
}
