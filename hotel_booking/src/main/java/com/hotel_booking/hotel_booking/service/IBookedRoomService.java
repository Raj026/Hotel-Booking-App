package com.hotel_booking.hotel_booking.service;

import com.hotel_booking.hotel_booking.model.BookedRoom;

import java.util.List;

public interface IBookedRoomService {

    List<BookedRoom> getAllBookingsByRoomId(Long roomId);
}
