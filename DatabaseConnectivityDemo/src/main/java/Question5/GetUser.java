package Question5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class GetUser {
    @Autowired
    DataSource dataSource;
    @Autowired
    JdbcTemplate jdbcTemplate;


    void getUser() {
        String sql = "SELECT NAME FROM user WHERE username = ?";
        System.out.println(jdbcTemplate.queryForObject(sql, new Object[]{"rishabh03"}, String.class));
    }
}
