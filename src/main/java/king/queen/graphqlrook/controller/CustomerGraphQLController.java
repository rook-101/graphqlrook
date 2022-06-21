package king.queen.graphqlrook.controller;

import king.queen.graphqlrook.domain.entity.Customer;
import king.queen.graphqlrook.domain.usecase.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

@Controller
@RequiredArgsConstructor
public class CustomerGraphQLController {
    private final CustomerService customerService;

    @SchemaMapping(typeName = "Query", field = "customers")
    Flux<Customer> customers() {
        return customerService.execute();
    }
}