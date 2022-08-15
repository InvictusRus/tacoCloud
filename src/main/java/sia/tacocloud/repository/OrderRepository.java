package sia.tacocloud.repository;

import java.util.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.domain.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

  List<TacoOrder> findByDeliveryZip(String deliveryZip);

  List<TacoOrder> readOrdersByDeliveryZipAndPlacedAtBetween(String deliveryZip, Date startDate,
      Date endDate);
}
