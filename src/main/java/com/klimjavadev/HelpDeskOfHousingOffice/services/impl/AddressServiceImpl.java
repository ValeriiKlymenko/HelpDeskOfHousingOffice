package com.klimjavadev.HelpDeskOfHousingOffice.services.impl;

import com.klimjavadev.HelpDeskOfHousingOffice.exceptions.NullEntityReferenceException;
import com.klimjavadev.HelpDeskOfHousingOffice.models.entities.Address;
import com.klimjavadev.HelpDeskOfHousingOffice.repositories.AddressRepository;
import com.klimjavadev.HelpDeskOfHousingOffice.services.AddressService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address create(Address address) {
        if (address != null) {
            return addressRepository.save(address);
        }
        throw new NullEntityReferenceException("Address cannot be 'null'");
    }

    @Override
    public Address readById(long id) {
        return addressRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Address with id " + id + " not found"));
    }

    @Override
    public Address update(Address address) {
        if (address != null) {
            readById(address.getId());
            return addressRepository.save(address);
        }
        throw new NullEntityReferenceException("Address cannot be 'null'");
    }

    @Override
    public void delete(long id) {
        Address address = readById(id);
        addressRepository.delete(address);
    }

    @Override
    public List<Address> getAll() {
        return addressRepository.findAll();
    }
}
