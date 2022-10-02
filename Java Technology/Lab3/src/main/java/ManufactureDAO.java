import org.hibernate.Session;

import java.util.List;
import java.lang.String;
import java.util.Scanner;

public class ManufactureDAO implements CRUD<Manufacture>{
    private Session session;

    public ManufactureDAO() {
        session = HibernateUtils.getSession();
    }

    //3
    @Override
    public boolean add(Manufacture item) {
        session.beginTransaction();
        session.persist(item);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public Manufacture get(String id) {
        return session.get(Manufacture.class, id);
    }

    @Override
    public List<Manufacture> getAll() {
        session.beginTransaction();
        List<Manufacture> manufactures =  session.createQuery("from Manufacture", Manufacture.class).list();
        session.close();
        return manufactures;
    }

    @Override
    public boolean remove(String id) {
        session.beginTransaction();
        if(session.get(Manufacture.class, id) != null){
            session.remove(session.get(Manufacture.class, id));
            session.getTransaction().commit();
            session.close();
            return true;
        }
        session.close();
        return false;
    }

    @Override
    public boolean remove(Manufacture item) {
        session.beginTransaction();
        if(session.get(Manufacture.class, item.getId()) != null){
            session.remove(session.get(Manufacture.class, item.getId()));
            session.getTransaction().commit();
            session.close();
            return true;
        }
        session.close();
        return false;
    }

    @Override
    public boolean update(Manufacture item) {
        session.beginTransaction();
        Manufacture m = session.get(Manufacture.class, item.getId());

        System.out.print("Enter new name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Enter new location: ");
        String location = new Scanner(System.in).nextLine();
        System.out.print("Enter new employee: ");
        int employee = new Scanner(System.in).nextInt();

        m.setName(name);
        m.setLocation(location);
        m.setEmployee(employee);

        session.update(m);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    //5
    public boolean checkNumberOfEmployee(){
        List<Manufacture> list = session.createQuery("from Manufacture", Manufacture.class).list();
        for (Manufacture manufacture : list) {
            if(manufacture.getEmployee() < 100){
                return false;
            }
        }
        return true;
    }

    public int sumOfEmployee(){
        List<Manufacture> list = session.createQuery("from Manufacture", Manufacture.class).list();
        int sum = 0;
        for (Manufacture manufacture : list) {
            sum += manufacture.getEmployee();
        }
        return sum;
    }


    public Manufacture lastManufacturerInUS() throws Exception {
        List<Manufacture> list = session.createQuery("from Manufacture", Manufacture.class).list();
        for (Manufacture manufacture : list) {
            if(manufacture.getLocation().equals("US") && manufacture.getId() == list.get(list.size() - 1).getId()){
                return manufacture;
            }
        }
        throw InvalidOperationException("No manufacturer in US");
    }

    private Exception InvalidOperationException(String message) {
        return new Exception(message);
    }



}
