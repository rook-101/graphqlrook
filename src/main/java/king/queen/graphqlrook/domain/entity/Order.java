package king.queen.graphqlrook.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @JsonProperty("id")
    Integer id;
    @JsonProperty("customerId")
    Integer customerId;
}
