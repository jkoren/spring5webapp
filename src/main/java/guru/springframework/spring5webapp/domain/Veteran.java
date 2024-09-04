package guru.springframework.spring5webapp.domain;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Veteran {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String participantId;

    @OneToMany(cascade= CascadeType.ALL) // mappedBy = "veteran",
//    @JoinColumn(name = "veteran_id")
    private Set<Beneficiary> beneficiaries = new HashSet<>();

    public Veteran() {
    }

    public Veteran(String name, String participantId) {
        this.name = name;
        this.participantId = participantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    public Set<Beneficiary> getBeneficiaries() {
        return beneficiaries;
    }

    public void setBeneficiaries(Set<Beneficiary> beneficiaries) {
        this.beneficiaries = beneficiaries;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Veteran{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", participantId='" + participantId + '\'' +
                ", beneficiaries=" + beneficiaries +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Veteran veteran = (Veteran) o;

        return Objects.equals(id, veteran.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
