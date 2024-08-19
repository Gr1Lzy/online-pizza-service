package org.github.application.dto.order;

import lombok.Data;
import org.github.application.model.User;
import org.github.application.util.OrderStatus;

import java.time.LocalDateTime;

@Data
public class OrderDetailDto {
    private Long id;
    private User user;
    private Long totalAmount;
    private OrderStatus status;
    private String paymentId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
