package org.design_patterns.structural.adapter.classes;

import org.design_patterns.structural.adapter.classes.adaptees.XmlData;
import org.design_patterns.structural.adapter.classes.adaptees.XmlTextData;
import org.design_patterns.structural.adapter.classes.adapters.XmlToJsonAdapter;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        final XmlData xmlData = new XmlData("books", List.of(
                new XmlData("book", List.of(new XmlTextData("Book One"))),
                new XmlData("book", List.of(new XmlTextData("Book Two")))
        ));
        final XmlToJsonAdapter xmlToJsonAdapter = new XmlToJsonAdapter(xmlData);
        final Map<String, Object> jsonData = xmlToJsonAdapter.getJsonData();
        System.out.println(printObject(jsonData));
    }

    private static String printObject(final Map<?, ?> object) {
        final StringBuilder sb = new StringBuilder();
        sb.append("{");
        object.forEach((key, value) -> sb.append(key).append(": ").append(checkObject(value)).append(","));
        deleteLastOccurrence(sb, ",");
        sb.append("}");
        return sb.toString();
    }

    private static String printArray(final List<?> array) {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (final Object object : array) {
            sb.append(checkObject(object)).append(",");
        }
        deleteLastOccurrence(sb, ",");
        sb.append("]");
        return sb.toString();
    }

    private static String checkObject(final Object object) {
        if (object instanceof List<?> array) {
            return printArray(array);
        } else if (object instanceof Map<?,?> map) {
            return printObject(map);
        } else {
            return object.toString();
        }
    }

    private static void deleteLastOccurrence(final StringBuilder stringBuilder, final String target) {
        int lastIndex = stringBuilder.lastIndexOf(target);
        if (lastIndex != -1) {
            stringBuilder.delete(lastIndex, lastIndex + target.length());
        }
    }
}
