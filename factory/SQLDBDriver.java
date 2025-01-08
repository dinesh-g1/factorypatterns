package factory;

public interface SQLDBDriver {
    void connect();
    void execute(String statement);
    void close();
}
