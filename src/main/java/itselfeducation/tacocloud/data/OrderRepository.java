package itselfeducation.tacocloud.data;

import itselfeducation.tacocloud.Taco;
import itselfeducation.tacocloud.TacoOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder,Long> {

    //Generating repository, SpringData checking all methods in the interface
    //analyse names of methods and try to define "for what that method here?"
    //the details of methods are defined in signature of methods

    //for the more valid signature search in google

    List<TacoOrder> findByDeliveryZip(String deliveryZip); //find list filter by delivery zip


    //the most interesting way to make requests to DB
    //verb = read (get, count, find)
    //subject = order, but we can put away that
    //By is the separator of variables, which will search (DeliveryZip, PlacedAt)
    //Between - mark, that result must be between start & end dates in param PlacedAt
    List<TacoOrder> readOrdersByDeliveryZipAndPlacedAtBetween(
            String deliveryZip, Date startDate, Date endDate);


    //if signature difficult, use @Query("request") ->
//    @Query("Order o where o.deliveryCity=’Seattle’")
//    List<TacoOrder> readOrdersDeliveredInSeattle();

}
