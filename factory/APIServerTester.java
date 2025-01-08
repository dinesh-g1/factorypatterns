package factory;

public class APIServerTester {
    public static void main(String[] args) {
        SQLDBDriver sqldbDriver = DBDriverFactory.getDriver("PostgreSQL");
        APIServer apiServer = new APIServer(sqldbDriver);
        apiServer.getResults();
    }
}
