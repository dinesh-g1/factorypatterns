package factory;

public class SQLServerDriver implements SQLDBDriver{
    @Override
    public void connect() {
        System.out.println("Connected to SQLServer db");
    }

    @Override
    public void execute(String statement) {
        System.out.println("Executed the query in SQLServer db");
    }

    @Override
    public void close() {
        System.out.println("Closed the connection to SQLServer db");
    }
}
