package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Veteran;
import org.springframework.data.repository.CrudRepository;

public interface VeteranRepository extends CrudRepository<Veteran, Long> {
}
