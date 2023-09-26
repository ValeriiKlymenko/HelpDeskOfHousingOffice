package com.klimjavadev.HelpDeskOfHousingOffice.repositories;

import com.klimjavadev.HelpDeskOfHousingOffice.models.entities.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface RequestRepository extends JpaRepository<Request, Long> {

    @Query("from Request where building.id = :buildingId")
    List<Request> getByBuildingId(long buildingId);

    @Query("from Request where user.id = :userId")
    List<Request> getByUserId(long userId);

    List<Request> findByDataCreated(LocalDateTime dataCreated);
}
