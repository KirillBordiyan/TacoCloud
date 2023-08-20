package itselfeducation.tacocloud.data;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;

//@Data - lombok automatically generate getters/setters at the same time with compilation
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor(aaccess= AccessLevel.PRIVATE, force=true)
public class Ingredient  implements Persistable<String> {

    @Id
    private final String id;
    private final String name;
    private final Type type;

    public enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
