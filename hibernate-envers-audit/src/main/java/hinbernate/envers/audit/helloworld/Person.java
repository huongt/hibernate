package hinbernate.envers.audit.helloworld;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Audited
@Table(name = "person")
@Getter
@Setter
public class Person extends GenericEntity {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    @ManyToOne
    private Address address;
}
