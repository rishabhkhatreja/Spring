package SpringBootDemo.controller;

import SpringBootDemo.entity.Database;
import SpringBootDemo.service.DatabaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {


    @Autowired
    DatabaseService databaseService;

    @GetMapping("/database")
    public Database getdetail() {
        return databaseService.getDetails();
    }
}
