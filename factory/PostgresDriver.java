package factory;

public class PostgresDriver implements SQLDBDriver{
    @Override
    public void connect() {
        System.out.println("Connected to Postgres db");
    }

    @Override
    public void execute(String statement) {
        System.out.println("Executed the query in Postgres db");
    }

    @Override
    public void close() {
        System.out.println("Closed the connection to Postgres db");
    }
}
