import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "MobilePhone")
public class Phone {
    @Id
    @GeneratedValue(generator = "myGenerator")
    @GenericGenerator(name = "myGenerator", strategy = "MyGeneratorPhone")
    @Column(name = "Phone_id")
    String id;
    @Column(nullable = false)
    @Size(min = 3, max = 128)
    String name;
    @Column(nullable = false)
    int price;
    @Column(nullable = false)
    String color;
    String country;
    int quantity;

    @ManyToOne
    @JoinColumn(name = "manufacture_id", referencedColumnName = "id", nullable = false)
    Manufacture manu;

    public Phone(String name, int price, String color, String country, int quantity) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.country = country;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", country='" + country + '\'' +
                ", quantity=" + quantity +
                ", manu=" + manu.getName() +
                '}';
    }
}
