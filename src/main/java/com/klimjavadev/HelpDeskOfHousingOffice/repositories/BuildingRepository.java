package com.klimjavadev.HelpDeskOfHousingOffice.repositories;

import com.klimjavadev.HelpDeskOfHousingOffice.models.entities.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BuildingRepository extends JpaRepository<Building, Long> {

    @Query("from Building where housingOffice.id = :housingOfficeId")
    List<Building> getByHousingOfficeId(long housingOfficeId);

    Building findByAddressId(long AddressId);
}
