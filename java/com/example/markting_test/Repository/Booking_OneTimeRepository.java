package com.example.markting_test.Repository;

import com.example.markting_test.Model.BookingOneTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Booking_OneTimeRepository extends JpaRepository<BookingOneTime , Integer> {

    BookingOneTime findBooking_OneTimeById(Integer booking_id);
}
