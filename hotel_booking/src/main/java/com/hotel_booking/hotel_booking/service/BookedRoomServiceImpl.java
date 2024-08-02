package com.hotel_booking.hotel_booking.service;

import com.hotel_booking.hotel_booking.model.BookedRoom;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookedRoomServiceImpl implements IBookedRoomService{

    @Override
    public List<BookedRoom> getAllBookingsByRoomId(Long roomId) {
        return null;
    }
}
