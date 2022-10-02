import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

    private static SessionFactory factory;
    public static Session getSession() {
        if (factory == null) {
            factory = new Configuration()
                    .configure().addAnnotatedClass(Phone.class).addAnnotatedClass(Manufacture.class)
                    .buildSessionFactory();
        }
        return factory.getCurrentSession();
    }
}
