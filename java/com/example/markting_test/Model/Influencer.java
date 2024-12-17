package com.example.markting_test.Model;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Influencer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "varchar(30) not null")
    private String influencer_name;

    @NotEmpty(message = "phone number can not be null")
    @Column(unique = true , columnDefinition = "varchar(10) not null")
  //  @Size(min = 10 , max = 10)
    private String influencer_phone;


    @NotEmpty(message = "email can not be null")
    @Email
    @Column(unique = true , columnDefinition = "varchar(50) not null")
    private String influencer_email;

    @OneToMany(mappedBy = "influencer", cascade = CascadeType.ALL)
    private Set<Platform> platforms;

    @OneToMany(mappedBy = "influencer", cascade = CascadeType.ALL)
    private Set<BookingOneTime> bookingOneTimes;

    // Getters and Setters
}
