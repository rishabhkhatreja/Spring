package SpringBootDemo.service;

import SpringBootDemo.entity.Database;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

    @Value("${app.databaseName}")
    String name;
    @Value("${app.port}")
    int port;
    public Database getDetails()
    {
        return new Database(port,name);
    }
}
