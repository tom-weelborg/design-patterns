package org.design_patterns.creational.singleton;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {
    private static volatile Database instance;

    private Map<String, List<Object>> tables;

    private Database() {
        this.tables = new HashMap<>();
    }

    public static Database getInstance() {
        Database database = instance;
        if (database == null) {
            synchronized (Database.class) {
                database = instance;
                if (database == null) {
                    instance = database = new Database();
                }
            }
        }
        return database;
    }
}
