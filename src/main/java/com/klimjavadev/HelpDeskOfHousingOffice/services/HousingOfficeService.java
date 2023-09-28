package com.klimjavadev.HelpDeskOfHousingOffice.services;

import com.klimjavadev.HelpDeskOfHousingOffice.models.entities.HousingOffice;

import java.util.List;

public interface HousingOfficeService {

    HousingOffice create(HousingOffice housingOffice);
    HousingOffice readById(long id);
    HousingOffice update(HousingOffice housingOffice);
    void delete(long id);
    List<HousingOffice> getAll();
}
