import org.hibernate.Session;

import java.util.List;
import java.util.Scanner;

public class ProductDAO implements CRUD<Phone>{

    private Session session;

    public ProductDAO() {
        session = HibernateUtils.getSession();
    }


    //3
    @Override
    public boolean add(Phone item) {
        session.beginTransaction();
        session.persist(item);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public Phone get(String id) {
        session.beginTransaction();
        Phone p = session.get(Phone.class, id);
        session.close();
        return p;
    }

    @Override
    public List<Phone> getAll() {
//        session.beginTransaction();
        List<Phone> phones =  session.createQuery("from Phone", Phone.class).list();
//        session.close();
        return phones;
    }

    @Override
    public boolean remove(String id) {
//        session.beginTransaction();
        if(session.get(Phone.class, id) != null){
            session.remove(session.get(Phone.class, id));
            session.getTransaction().commit();
            session.close();
            return true;
        }
//        session.close();
        return false;
    }

    @Override
    public boolean remove(Phone item) {
//        session.beginTransaction();
        if(session.get(Phone.class, item.getId()) != null){
            session.remove(session.get(Phone.class, item.getId()));
            session.getTransaction().commit();
            session.close();
            return true;
        }
//        session.close();
        return false;
    }

    @Override
    public boolean update(Phone item) {
        Phone p = session.get(Phone.class, item.getId());

        System.out.print("Enter new name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Enter new price: ");
        int price = new Scanner(System.in).nextInt();
        System.out.print("Enter new color: ");
        String color = new Scanner(System.in).nextLine();
        System.out.print("Enter new country: ");
        String country = new Scanner(System.in).nextLine();
        System.out.print("Enter new quantity: ");
        int quantity = new Scanner(System.in).nextInt();

        p.setName(name);
        p.setPrice(price);
        p.setColor(color);
        p.setCountry(country);
        p.setQuantity(quantity);
        session.update(p);
        session.getTransaction().commit();
        return true;
    }


    //4
    public Phone getHighestPrice(){
        return session.createQuery("from Phone order by price desc", Phone.class).setMaxResults(1).uniqueResult();
    }

    public List<Phone> sortPhoneByCountry(){
        return session.createQuery("from Phone order by country desc, price desc", Phone.class).list();
    }

    public boolean checkPrice(){
        return session.createQuery("from Phone where price > 50000000", Phone.class).list().size() > 0;
    }

    public Phone getFirstPinkPhone(){
        return session.createQuery("from Phone where color = 'Pink' and price > 15000000", Phone.class).setMaxResults(1).uniqueResult();
    }
}
