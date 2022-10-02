import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
public class Manufacture {
    @Id
    @GeneratedValue(generator = "myGenerator")
    @GenericGenerator(name = "myGenerator", strategy = "MyGeneratorManu")
    String id;
    @Size(min = 3, max = 128)
    String name;
    String location;
    int employee;

    @OneToMany(mappedBy = "manu")
    List<Phone> phones;

    public Manufacture(String name, String location, int employee) {
        this.name = name;
        this.location = location;
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Manufacture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", employee=" + employee +
                ", phones=" + phones.size() +
                '}';
    }
}
