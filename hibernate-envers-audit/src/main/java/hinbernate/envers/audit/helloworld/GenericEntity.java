package hinbernate.envers.audit.helloworld;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class GenericEntity {
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
