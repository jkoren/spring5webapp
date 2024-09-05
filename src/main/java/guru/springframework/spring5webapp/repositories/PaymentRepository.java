package guru.springframework.spring5webapp.repositories;


import guru.springframework.spring5webapp.domain.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
