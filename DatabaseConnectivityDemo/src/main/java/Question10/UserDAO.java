package Question10;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDAO {
    @Autowired
    SessionFactory sessionFactoryBean;

    void sessionFactoryDemo() {
        String sql = "SELECT COUNT(*) FROM user";
        Query query = sessionFactoryBean.openSession().createSQLQuery(sql);
        System.out.println(query.uniqueResult());
    }
}

