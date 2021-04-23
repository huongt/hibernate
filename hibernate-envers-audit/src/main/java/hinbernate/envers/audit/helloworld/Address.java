package hinbernate.envers.audit.helloworld;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.Set;

@Entity
@Audited
@Getter
@Setter
public class Address extends GenericEntity {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "street_name", nullable = false)
    private String streetName;

    @OneToMany(mappedBy = "address")
    private Set<Person> persons;
}
