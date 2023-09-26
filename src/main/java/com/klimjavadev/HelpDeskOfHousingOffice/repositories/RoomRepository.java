package com.klimjavadev.HelpDeskOfHousingOffice.repositories;

import com.klimjavadev.HelpDeskOfHousingOffice.models.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {

    @Query("from Room where building.id = :buildingId")
    List<Room> getByBuildingId(long buildingId);
}
