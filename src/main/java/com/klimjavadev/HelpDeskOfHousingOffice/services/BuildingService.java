package com.klimjavadev.HelpDeskOfHousingOffice.services;

import com.klimjavadev.HelpDeskOfHousingOffice.models.entities.Building;

import java.util.List;

public interface BuildingService {

    Building create(Building building);
    Building readById(long id);
    Building update(Building building);
    void delete(long id);
    List<Building> getAll();
}
