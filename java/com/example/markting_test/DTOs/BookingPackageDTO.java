package com.example.markting_test.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
@AllArgsConstructor
@Data
public class BookingPackageDTO {
    private Integer bookingPackageId;
    private LocalDateTime bookingDate;
    private Double bookingTotalPrice;
    private String bookingStatus;
    private Integer companyId;
    private Integer influencerId;
    private Integer packageEntityId;
}
