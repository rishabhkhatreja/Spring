package Question11.RequiresNew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

public class InsertRecord {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    InsertRecord2 insertRecord2;

    @Transactional()
    public void insertUser()  {
        try {
            String sql = "INSERT INTO user (username,password,name,age,dob)VALUES(?,?,?,?,?)";
            jdbcTemplate.update(sql,"xyz", "xyz", "xyz", 1, new Date());

            insertRecord2.insertUser2();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
