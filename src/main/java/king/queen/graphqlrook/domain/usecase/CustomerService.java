package king.queen.graphqlrook.domain.usecase;

import king.queen.graphqlrook.domain.entity.Customer;
import king.queen.graphqlrook.domain.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository repository;

    public Flux<Customer> findAll() {
        return repository.findAll();
    }

}
