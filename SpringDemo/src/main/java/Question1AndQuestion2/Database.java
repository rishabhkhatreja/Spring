package Question1AndQuestion2;

public class Database {
    int port;
    String name;
    public Database(int port, String name ) {
        this.port = port;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Database{" +
                "port=" + port +
                ", name='" + name + '\'' +
                '}';
    }

    Database()
    {

    }

    public int getPort() {
        return port;
    }

    public String getName() {
        return name;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setName(String name) {
        this.name = name;
    }
}
