package com.klimjavadev.HelpDeskOfHousingOffice.services;

import com.klimjavadev.HelpDeskOfHousingOffice.models.entities.Room;

import java.util.List;

public interface RoomService {

    Room create(Room room);
    Room readById(long id);
    Room update(Room room);
    void delete(long id);
    List<Room> getAll();
}
