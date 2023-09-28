package com.klimjavadev.HelpDeskOfHousingOffice.services.impl;

import com.klimjavadev.HelpDeskOfHousingOffice.exceptions.NullEntityReferenceException;
import com.klimjavadev.HelpDeskOfHousingOffice.models.entities.Request;
import com.klimjavadev.HelpDeskOfHousingOffice.repositories.BuildingRepository;
import com.klimjavadev.HelpDeskOfHousingOffice.repositories.RequestRepository;
import com.klimjavadev.HelpDeskOfHousingOffice.repositories.UserRepository;
import com.klimjavadev.HelpDeskOfHousingOffice.services.RequestService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {

    private final RequestRepository requestRepository;
    private final UserRepository userRepository;
    private final BuildingRepository buildingRepository;

    public RequestServiceImpl(RequestRepository requestRepository, UserRepository userRepository, BuildingRepository buildingRepository) {
        this.requestRepository = requestRepository;
        this.userRepository = userRepository;
        this.buildingRepository = buildingRepository;
    }

    @Override
    public Request create(Request request) {
        if (request != null) {
            return requestRepository.save(request);
        }
        throw new NullEntityReferenceException("Request cannot be 'null'");
    }

    @Override
    public Request readById(long id) {
        return requestRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Request with id " + id + " not found"));
    }

    @Override
    public Request update(Request request) {
        if (request != null) {
            readById(request.getId());
            return requestRepository.save(request);
        }
        throw new NullEntityReferenceException("Request cannot be 'null'");
    }

    @Override
    public void delete(long id) {
        Request request = readById(id);
        requestRepository.delete(request);
    }

    @Override
    public List<Request> getAll() {
        return requestRepository.findAll();
    }
}
