package com.klimjavadev.HelpDeskOfHousingOffice.services.impl;

import com.klimjavadev.HelpDeskOfHousingOffice.exceptions.NullEntityReferenceException;
import com.klimjavadev.HelpDeskOfHousingOffice.models.entities.HousingOffice;
import com.klimjavadev.HelpDeskOfHousingOffice.repositories.AddressRepository;
import com.klimjavadev.HelpDeskOfHousingOffice.repositories.HousingOfficeRepository;
import com.klimjavadev.HelpDeskOfHousingOffice.services.HousingOfficeService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HousingOfficeServiceImpl implements HousingOfficeService {

    private final HousingOfficeRepository housingOfficeRepository;
    private final AddressRepository addressRepository;

    public HousingOfficeServiceImpl(HousingOfficeRepository housingOfficeRepository, AddressRepository addressRepository) {
        this.housingOfficeRepository = housingOfficeRepository;
        this.addressRepository = addressRepository;
    }

    @Override
    public HousingOffice create(HousingOffice housingOffice) {
        if (housingOffice != null) {
            return housingOfficeRepository.save(housingOffice);
        }
        throw new NullEntityReferenceException("Housing Office cannot be 'null'");
    }

    @Override
    public HousingOffice readById(long id) {
        return housingOfficeRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Housing Office with id " + id + " not found"));
    }

    @Override
    public HousingOffice update(HousingOffice housingOffice) {
        if (housingOffice != null) {
            readById(housingOffice.getId());
            return housingOfficeRepository.save(housingOffice);
        }
        throw new NullEntityReferenceException("Housing Office cannot be 'null'");
    }

    @Override
    public void delete(long id) {
        HousingOffice housingOffice = readById(id);
        housingOfficeRepository.delete(housingOffice);
    }

    @Override
    public List<HousingOffice> getAll() {
        return housingOfficeRepository.findAll();
    }
}
