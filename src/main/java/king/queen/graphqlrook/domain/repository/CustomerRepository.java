package king.queen.graphqlrook.domain.repository;

import king.queen.graphqlrook.domain.entity.Customer;
import king.queen.graphqlrook.domain.entity.Player;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CustomerRepository extends ReactiveCrudRepository<Customer, Integer> {

}
