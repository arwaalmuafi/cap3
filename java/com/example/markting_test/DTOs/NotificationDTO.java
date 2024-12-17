package com.example.markting_test.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class NotificationDTO {
    private Integer id;
    private String notificationDescription;
    private String notificationToUser;
    private LocalDateTime notificationCreateAt;

}
