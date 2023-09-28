package com.klimjavadev.HelpDeskOfHousingOffice.services.impl;

import com.klimjavadev.HelpDeskOfHousingOffice.exceptions.NullEntityReferenceException;
import com.klimjavadev.HelpDeskOfHousingOffice.models.entities.Building;
import com.klimjavadev.HelpDeskOfHousingOffice.repositories.AddressRepository;
import com.klimjavadev.HelpDeskOfHousingOffice.repositories.BuildingRepository;
import com.klimjavadev.HelpDeskOfHousingOffice.repositories.HousingOfficeRepository;
import com.klimjavadev.HelpDeskOfHousingOffice.services.BuildingService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingServiceImpl implements BuildingService {

    private final BuildingRepository buildingRepository;
    private final AddressRepository addressRepository;
    private final HousingOfficeRepository housingOfficeRepository;

    public BuildingServiceImpl(BuildingRepository buildingRepository, AddressRepository addressRepository, HousingOfficeRepository housingOfficeRepository) {
        this.buildingRepository = buildingRepository;
        this.addressRepository = addressRepository;
        this.housingOfficeRepository = housingOfficeRepository;
    }

    @Override
    public Building create(Building building) {
        if (building != null) {
            return buildingRepository.save(building);
        }
        throw new NullEntityReferenceException("Building cannot be 'null'");
    }

    @Override
    public Building readById(long id) {
        return buildingRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Building with id " + id + " not found"));
    }

    @Override
    public Building update(Building building) {
        if (building != null) {
            readById(building.getId());
            return buildingRepository.save(building);
        }
        throw new NullEntityReferenceException("Building cannot be 'null'");
    }

    @Override
    public void delete(long id) {
        Building building = readById(id);
        buildingRepository.delete(building);
    }

    @Override
    public List<Building> getAll() {
        return buildingRepository.findAll();
    }
}
