package factory;

public class APIServer {
    private final SQLDBDriver sqldbDriver;

    public APIServer(SQLDBDriver sqldbDriver) {
        this.sqldbDriver = sqldbDriver;
    }

    public void getResults() {
        sqldbDriver.connect();
        sqldbDriver.execute("select * from bharat");
        sqldbDriver.close();
    }
}
