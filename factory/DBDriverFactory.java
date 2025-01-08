package factory;

public class DBDriverFactory {

    private static final String MY_SQL = "MySQL";
    private static final String POSTGRESQL = "PostgreSQL";
    //private static final String SQL_SERVER = "SQLServer";

    public static SQLDBDriver getDriver(String dbName) {
        SQLDBDriver sqldbDriver;
        if (dbName.equals(MY_SQL))
            return new MySQLDriver();
        else if (dbName.equals(POSTGRESQL))
            return new PostgresDriver();
        else
            return new SQLServerDriver();
    }
}
