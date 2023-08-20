package itselfeducation.tacocloud.data;

import itselfeducation.tacocloud.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder,Long> {
}
