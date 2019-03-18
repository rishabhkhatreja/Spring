package Question12.NoRollBackFor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

public class InsertRecord {
    @Autowired
    JdbcTemplate jdbcTemplate;


@Transactional(noRollbackFor = ArithmeticException.class)
    public void insertUser()  {
        try {
            String sql = "INSERT INTO user (username,password,name,age,dob)VALUES(?,?,?,?,?)";
            jdbcTemplate.update(sql,"xyz", "xyz", "xyz", 1, new Date());
            int a=10/0;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
