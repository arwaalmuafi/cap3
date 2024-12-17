package com.example.markting_test.Repository;

import com.example.markting_test.Model.BookingPackage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingPackageRepository extends JpaRepository<BookingPackage,Integer> {
    BookingPackage findBookingPackageByBookingPackageId(Integer id);

    List<BookingPackage> findAllByInfluencerId(Integer influencerId);

    List<BookingPackage> findAllByCompanyIdAndBookingStatus(Integer companyId, String status);
}
