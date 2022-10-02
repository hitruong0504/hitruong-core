import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.util.stream.Stream;

public class MyGeneratorManu implements IdentifierGenerator {

    private String prefix = "ID";
    public String generate(SharedSessionContractImplementor session, Object obj) throws HibernateException {
        String query = "SELECT m.id FROM Manufacture m";
        Stream<String> ids = session.createQuery(query, String.class).stream();
        Long max = ids.map(o -> o.replace(prefix, "")).mapToLong(Long::parseLong).max().orElse(0L);
        return prefix + (String.format("%02d", max + 1));
    }

}
