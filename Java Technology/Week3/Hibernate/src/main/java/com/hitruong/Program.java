package com.hitruong;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.sql.SQLException;

public class Program
{
    public static void main( String[] args ) throws SQLException {
        SessionFactory sf =  new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        Session session = sf.getCurrentSession();

        Transaction tx = session.beginTransaction();
//        Student s1 = new Student("Hi Truong", 20, 8.2);
//        Student s2 = new Student("Nguyen Tuan", 22, 7.7);
//
//        session.persist(s1);
//        session.persist(s2);
//        session.createQuery("from Student s", Student.class).list().forEach(System.out::println);

//        session.createQuery("", Student.class);

//        int row = session.createQuery("delete Student where id = 5").executeUpdate();
//        System.out.println(row == 1);

//        Student s = session.get(Student.class, 6);
//        s.setName("Nguyen Hao");
//        session.persist(s);
//        System.out.println(s);

        double score = 7.7;
        Query qr = session.createQuery("from Student s where s.score = :score", Student.class);
        qr.setParameter("score", score);
        qr.list().forEach(System.out::println);
        tx.commit();
        session.close();
        sf.close();
    }
}
