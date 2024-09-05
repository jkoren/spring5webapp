package guru.springframework.spring5webapp.repositories;


import guru.springframework.spring5webapp.domain.Beneficiary;
import org.springframework.data.repository.CrudRepository;

public interface BeneficiaryRepository extends CrudRepository<Beneficiary, Long> {
}
