package Question1;

public class Database {
    int port;
    String name;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void databaseDisplay()
    {
        System.out.println("port="+getPort());
        System.out.println("name="+getName());
    }
}
