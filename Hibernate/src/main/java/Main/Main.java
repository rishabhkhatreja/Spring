package Main;

import Entity.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        Create create = new Create();
        create.createAuthor(session);
        Read read = new Read();
        Author author =read.readAuthor(session);
        Update update=new Update();
        update.updateAuthor(session);
       /* Delete delete=new Delete();
        delete.deleteAuthor(session);*/
        session.getTransaction().commit();
        session.close();
        System.out.println("Author Is="+author);
    }
}

/*
Question5:can be achieved by commenting update delete operation And uncomment property update
 */

