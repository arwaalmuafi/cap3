package com.example.markting_test.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
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
public class Platform {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "platform can not be null")
    @Column(columnDefinition = "varchar(20) not null")
    private String platform_name;
    @NotNull(message = "followers can not be null")
    @Column(columnDefinition = "double not null")
    @Positive
    private Double platform_followers;

    // Relationships
    @ManyToOne
    @JsonIgnore
    private Influencer influencer;

    @OneToMany(mappedBy = "platform", cascade = CascadeType.ALL)
    private Set<Type> types;

    @OneToMany(mappedBy = "platform", cascade = CascadeType.ALL)
    private Set<BookingOneTime> bookingOneTimes;

}
