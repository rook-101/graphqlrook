package king.queen.graphqlrook.domain.usecase;

import king.queen.graphqlrook.domain.entity.Customer;
import king.queen.graphqlrook.domain.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerService {
    private final CustomerRepository repository;

    public Flux<Customer> findAll() {
        return repository.findAll();
    }
    public Mono<Customer> findByName(String name) {
        log.info("service findBy Name");
        return repository.findByName(name);
    }

    public Mono<Customer> addCustomer(String name) {
        log.info("service add Name");
        return repository.save(new Customer(name));
    }
}
