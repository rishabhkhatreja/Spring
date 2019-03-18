package Question12.ReadOnly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

public class InsertRecord {
    @Autowired
    JdbcTemplate jdbcTemplate;


@Transactional(readOnly = true)
    public void insertUser()  {
        try {
            String sql = "INSERT INTO user (username,password,name,age,dob)VALUES(?,?,?,?,?)";
            jdbcTemplate.update(sql,"xyz", "xyz", "xyz", 1, new Date());

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
