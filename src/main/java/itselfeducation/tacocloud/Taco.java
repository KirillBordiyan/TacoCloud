package itselfeducation.tacocloud;

import itselfeducation.tacocloud.data.Ingredient;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class Taco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date createdAt = new Date();

    @NotNull
    @Size(min = 3, message = "Name must be at least 3 character long")
    private String name;

    @Size(min = 3, message = "You must choose at least 3 ingredient")
    @ManyToMany()
    private List<Ingredient> ingredients = new ArrayList<>();

    public void addIngredient(Ingredient ingredient){
        this.ingredients.add(ingredient);
    }
}
