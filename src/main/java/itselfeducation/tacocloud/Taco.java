package itselfeducation.tacocloud;

import itselfeducation.tacocloud.Ingredient;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.util.List;

@Data
public class Taco {

    @NotNull
    @Size(min = 3, message = "Name must be at least 3 character long")
    private String name;

    @NotNull
    @Size(min = 3, message = "You must choose at least 3 ingredient")
    private List<Ingredient> ingredients;

}
