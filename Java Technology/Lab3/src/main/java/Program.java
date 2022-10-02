import org.hibernate.Session;

import java.sql.SQLException;
import java.util.List;

public class Program {

    public static void main(String[] args) throws SQLException {
        Session session = HibernateUtils.getSession();

        Phone p1 = new Phone("iPhone 12", 899, "Black", "USA", 100);
        Phone p2 = new Phone("iPhone 12 Pro", 999, "Black", "USA", 50);
        Phone p3 = new Phone("iPhone 12 Pro Max", 1099, "Blue", "USA", 50);
        Phone p4 = new Phone("iPhone 14 Pro Max", 1099, "Deep Purple", "USA", 50);
        Phone p5 = new Phone("iPhone 14 Pro", 999, "Gold", "USA", 50);

        Phone p6 = new Phone("XiaoMi Mi 10", 999, "Gold", "China", 50);
        Phone p7 = new Phone("XiaoMi Mi 10 Pro", 1199, "Black", "China", 50);
        Phone p8 = new Phone("XiaoMi Mi 10 Lite", 499, "Green", "China", 50);

        Manufacture m1 = new Manufacture("Apple", "USA", 10000);
        Manufacture m2 = new Manufacture("XiaoMi", "China", 10000);

        p1.setManu(m1);
        p2.setManu(m1);
        p3.setManu(m1);
        p4.setManu(m1);
        p5.setManu(m1);

        p6.setManu(m2);
        p7.setManu(m2);
        p8.setManu(m2);


        m1.setPhones(List.of(p1, p2, p3, p4, p5));
        m2.setPhones(List.of(p6, p7, p8));

        session.beginTransaction();
        session.persist(m1);
        session.persist(m2);
        session.persist(p1);
        session.persist(p2);
        session.persist(p3);
        session.persist(p4);
        session.persist(p5);
        session.persist(p6);
        session.persist(p7);
        session.persist(p8);

        session.getTransaction().commit();
        session.close();

        ProductDAO productDAO = new ProductDAO();
        ManufactureDAO manufactureDAO = new ManufactureDAO();

        Phone p = new Phone("iPhone 11", 10999000, "white", "USA", 1);
        p.setManu(m1);
        if (productDAO.add(p)) {
            System.out.println("Add success");
        } else {
            System.out.println("Add failed");
        }

        System.out.println("Get by ID: ");
        System.out.println(productDAO.get("ID01"));

        System.out.println("Get all: ");
        List<Phone> phones = productDAO.getAll();
        for (Phone phone : phones) {
            System.out.println(phone);
        }


        System.out.println("Remove by ID: ");
        if (productDAO.remove("ID01")) {
            System.out.println("Remove success");
        } else {
            System.out.println("Remove failed");
        }

        System.out.println("Remove by Phone: ");
        if (productDAO.remove(p)) {
            System.out.println("Remove success");
        } else {
            System.out.println("Remove failed");
        }


        System.out.println("Update: ");
        p.setPrice(999);
        if (productDAO.update(p)) {
            System.out.println("Update success");
        } else {
            System.out.println("Update failed");
        }

        System.out.println("Highest Price: ");
        System.out.println(productDAO.getHighestPrice());

        System.out.println("Sort Phone by country: ");
        List<Phone> phones1 = productDAO.sortPhoneByCountry();
        for (Phone phone : phones1) {
            System.out.println(phone);
        }

        System.out.println("Phone have price greater than 50000000: ");
        boolean n = productDAO.checkPrice();

        System.out.println(productDAO.getFirstPinkPhone());
    }
}
