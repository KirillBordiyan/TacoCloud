package itselfeducation.tacocloud;

import itselfeducation.tacocloud.data.Ingredient;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table
public class Taco {

    @Id
    private Long id;
    private Date createdAt = new Date();

    @NotNull
    @Size(min = 3, message = "Name must be at least 3 character long")
    private String name;

    @NotNull
    @Size(min = 3, message = "You must choose at least 3 ingredient")
    private List<Ingredient> ingredients;

}
