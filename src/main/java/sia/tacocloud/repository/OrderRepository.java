package sia.tacocloud.repository;

import sia.tacocloud.domain.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder tacoOrder);
}
