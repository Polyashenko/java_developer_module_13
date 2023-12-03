package org.example;
import org.flywaydb.core.Flyway;

public class DatabaseApplication {

    public static final String JDBC_URL = "jdbc:h2:/Users/dmytropoliashenko/work/Java/GoIt/java_developer_module_13/db/SpaceTravel3;MODE=MYSQL";
    //The username for the database connection.
    public static final String USERNAME = "sa";
    // The password for the database connection.
    public static final String PASSWORD = "";

    public void run() {
        new DatabaseMigration(JDBC_URL, USERNAME, PASSWORD).migrate();
    }
}

