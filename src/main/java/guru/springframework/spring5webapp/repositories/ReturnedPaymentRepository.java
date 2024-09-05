package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.ReturnedPayment;
import org.springframework.data.repository.CrudRepository;

public interface ReturnedPaymentRepository extends CrudRepository<ReturnedPayment, Long> {
}
