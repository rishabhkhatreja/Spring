package Question11.Required;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Repository
public class InsertRecord2 {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional(propagation = Propagation.REQUIRED)
   public  void insertUser2() {
        String sql = "INSERT INTO user (username,password,name,age,dob)VALUES(?,?,?,?,?)";

        jdbcTemplate.update(sql, "abc", "abc", "abc", 2, new Date());
        throw new RuntimeException();

        // System.out.println("inserted successfully!");
    }
}
