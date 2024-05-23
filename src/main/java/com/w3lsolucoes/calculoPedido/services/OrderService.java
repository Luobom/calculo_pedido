package com.w3lsolucoes.calculoPedido.services;

import com.w3lsolucoes.calculoPedido.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

    public double total(Order order) {
        double orderDiscounted = order.getBasic() - ((order.getBasic()/100)*order.getDiscount());
        return orderDiscounted + shippingService.shipment(order);
    }

}
