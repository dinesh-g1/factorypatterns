package factory;

public class MySQLDriver implements SQLDBDriver{
    @Override
    public void connect() {
        System.out.println("Connected to MySQL db");
    }

    @Override
    public void execute(String statement) {
        System.out.println("Executed the query in MySQL db");
    }

    @Override
    public void close() {
        System.out.println("Closed the connection to MySQL db");
    }
}
