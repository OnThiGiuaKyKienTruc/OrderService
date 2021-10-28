package com.example.order.Repository;
import com.example.order.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OderRepository extends JpaRepository<Order, Long> {
//    Order findOrderById(Long orderId);
}
