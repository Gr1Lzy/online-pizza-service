package org.github.application.dto.order;

import lombok.Data;
import org.github.application.util.OrderStatus;

@Data
public class OrderDto {
    private Long id;
    private Long userId;
    private Long totalAmount;
    private OrderStatus status;
    private String paymentId;
}
