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
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String company_name;

    @Column(nullable = false)
    private String company_email;

    @Column(nullable = false)
    private String company_phone;

    @Column(nullable = false)
    private String company_CR;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private Set<BookingOneTime> bookingOneTimes;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private Set<Review> reviews;

}