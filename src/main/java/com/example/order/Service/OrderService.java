package com.example.order.Service;
import com.example.order.Entity.Order;
import com.example.order.Repository.OderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
//@RequiredArgsConstructor
public class OrderService {
    @Autowired
    private OderRepository oderRepository;

    public Order saveKhoa(Order order) {
        log.info("Inside saveOrder of Service! ");
        return oderRepository.save(order);
    }

    public Order findOrderById(Long orderId) {
        log.info("inside findOrderById ");
        return oderRepository.findById(orderId).get();
    }
}
