package king.queen.graphqlrook.controller;

import java.util.ArrayList;
import king.queen.graphqlrook.domain.entity.Customer;
import king.queen.graphqlrook.domain.entity.Order;
import king.queen.graphqlrook.domain.usecase.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

@Controller
@RequiredArgsConstructor
@Slf4j
public class CustomerGraphQLController {
    private final CustomerService customerService;

    @QueryMapping
    Flux<Customer> customers() {
        return customerService.findAll();
    }

    @SchemaMapping(typeName = "Customer")
    Flux<Order> orders(Customer customer) throws InterruptedException {
        // Thread.sleep(3000L);
        log.info("Here!!!");
        var orders = new ArrayList<Order>();
        for(var orderId = 1; orderId <= 12;++orderId) {
            orders.add(new Order(orderId, customer.getId()));
        }
        return Flux.fromIterable(orders);
    }
}
