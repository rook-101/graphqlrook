package king.queen.graphqlrook.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@Getter
public class Customer {

    @JsonProperty("id")
    @Id
    Integer id;

    @JsonProperty("name")
    String name;

    public Customer(String name) {
        this.name = name;
    }
}
