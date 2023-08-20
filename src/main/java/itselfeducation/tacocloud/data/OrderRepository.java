package itselfeducation.tacocloud.data;

import itselfeducation.tacocloud.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
