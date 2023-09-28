package com.klimjavadev.HelpDeskOfHousingOffice.services.impl;

import com.klimjavadev.HelpDeskOfHousingOffice.exceptions.NullEntityReferenceException;
import com.klimjavadev.HelpDeskOfHousingOffice.models.entities.Room;
import com.klimjavadev.HelpDeskOfHousingOffice.repositories.BuildingRepository;
import com.klimjavadev.HelpDeskOfHousingOffice.repositories.RoomRepository;
import com.klimjavadev.HelpDeskOfHousingOffice.services.RoomService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;
    private final BuildingRepository buildingRepository;

    public RoomServiceImpl(RoomRepository roomRepository, BuildingRepository buildingRepository) {
        this.roomRepository = roomRepository;
        this.buildingRepository = buildingRepository;
    }

    @Override
    public Room create(Room room) {
        if (room != null) {
            return roomRepository.save(room);
        }
        throw new NullEntityReferenceException("Room cannot be 'null'");
    }

    @Override
    public Room readById(long id) {
        return roomRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Room with id " + id + " not found"));
    }

    @Override
    public Room update(Room room) {
        if (room != null) {
            readById(room.getId());
            return roomRepository.save(room);
        }
        throw new NullEntityReferenceException("Room cannot be 'null'");
    }

    @Override
    public void delete(long id) {
        Room room = readById(id);
        roomRepository.delete(room);
    }

    @Override
    public List<Room> getAll() {
        return roomRepository.findAll();
    }
}
