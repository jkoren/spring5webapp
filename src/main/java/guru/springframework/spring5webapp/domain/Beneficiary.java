package guru.springframework.spring5webapp.domain;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Beneficiary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String type;
    @OneToMany(cascade= CascadeType.ALL) // mappedBy = "beneficiary",
//    @JoinColumn(name = "beneficiary_id")
    private Set<Payment> payments;
    @OneToMany(cascade= CascadeType.ALL) // mappedBy = "beneficiary"
//    @JoinColumn(name = "beneficiary_id")
    private Set<ReturnedPayment> returnedPayments = new HashSet<>();

    public Beneficiary() {
    }

    public Beneficiary(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Payment> getPayments() {
        return payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }

    public Set<ReturnedPayment> getReturnedPayments() {
        return returnedPayments;
    }

    public void setReturnedPayments(Set<ReturnedPayment> returnedPayments) {
        this.returnedPayments = returnedPayments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Beneficiary{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", payments=" + payments +
                ", returnedPayments=" + returnedPayments +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Beneficiary that = (Beneficiary) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
