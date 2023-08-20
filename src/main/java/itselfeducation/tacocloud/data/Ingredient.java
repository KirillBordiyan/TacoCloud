package itselfeducation.tacocloud.data;

import lombok.Data;

//lombok automatically generate getters/setters at the same time with compilation
@Data
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
