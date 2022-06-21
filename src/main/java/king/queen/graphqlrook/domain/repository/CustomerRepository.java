package king.queen.graphqlrook.domain.repository;

import king.queen.graphqlrook.domain.entity.Customer;
import king.queen.graphqlrook.domain.entity.Player;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerRepository extends ReactiveCrudRepository<Customer, Integer> {
    Mono<Customer> findByName(String name);
}
