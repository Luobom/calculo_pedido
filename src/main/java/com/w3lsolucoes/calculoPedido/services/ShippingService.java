package com.w3lsolucoes.calculoPedido.services;

import com.w3lsolucoes.calculoPedido.model.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {

        if(order.getBasic() < 100.0) {
            return 20.00;
        } else if(order.getBasic() >=100.00 && order.getBasic() <= 200.00){
            return 12.00;
        } else {
            return 0.00;
        }

    }
}
