package com.example.markting_test.Repository;

import com.example.markting_test.Model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification,Integer> {
    Notification findNotificationById(Integer id);

}
