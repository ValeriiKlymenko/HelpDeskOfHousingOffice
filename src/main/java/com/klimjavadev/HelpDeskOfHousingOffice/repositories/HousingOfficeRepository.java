package com.klimjavadev.HelpDeskOfHousingOffice.repositories;

import com.klimjavadev.HelpDeskOfHousingOffice.models.entities.HousingOffice;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HousingOfficeRepository extends JpaRepository<HousingOffice, Long> {

    HousingOffice findByName(String name);

    //який ЖЕКобслуговує будинок
//    HousingOffice (long buildingId);
}
