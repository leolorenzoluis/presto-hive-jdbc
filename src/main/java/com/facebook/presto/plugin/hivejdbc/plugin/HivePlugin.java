package com.facebook.presto.plugin.hivejdbc.plugin;

import com.facebook.presto.plugin.jdbc.JdbcPlugin;

public class HivePlugin extends JdbcPlugin {

    public HivePlugin() {
        super("hive-jdbc", new HiveClientModule());
    }
}
