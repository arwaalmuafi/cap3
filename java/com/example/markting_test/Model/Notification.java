package com.example.markting_test.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "description is mandatory")
    @Column(nullable = false)
    private String notification_description;

    @NotEmpty(message = "description is mandatory")
    @Column(nullable = false)
    private String notification_ToUser;

    private LocalDateTime notification_createAt;
}

