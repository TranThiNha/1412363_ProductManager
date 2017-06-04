package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by MyPC on 6/1/2017.
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public static Session getSession(){
        return sessionFactory.getCurrentSession();
    }

}
