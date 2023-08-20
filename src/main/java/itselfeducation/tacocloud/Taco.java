package itselfeducation.tacocloud;

import itselfeducation.tacocloud.data.Ingredient;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Taco {

    private Long id;
    private Date createdAt = new Date();

    @NotNull
    @Size(min = 3, message = "Name must be at least 3 character long")
    private String name;

    @NotNull
    @Size(min = 3, message = "You must choose at least 3 ingredient")
    private List<Ingredient> ingredients;

}
