package itselfeducation.tacocloud;

import itselfeducation.tacocloud.Ingredient;
import lombok.Data;
import java.util.List;

@Data
public class Taco {

    private String name;
    private List<Ingredient> ingredients;

}
