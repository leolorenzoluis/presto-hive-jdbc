# Presto Hive JDBC Plugin

This is a plugin for Presto that allow you to use Hive JDBC Connection

## Connection Configuration

Create new properties file inside etc/catalog dir:

* connector.name=hive-jdbc
* connection-url=jdbc:hive2://ip:port/database
* connection-user=<your-username>
* connection-password=<your-password>

Create a dir inside plugin dir called hive-jdbc. To make it easier you could copy all the libs from the target/lib/*.jars. to /plugin/hive-jdbc

## Building Presto Hive JDBC Plugin

mvn clean install
