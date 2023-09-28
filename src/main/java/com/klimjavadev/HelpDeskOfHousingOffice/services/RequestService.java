package com.klimjavadev.HelpDeskOfHousingOffice.services;

import com.klimjavadev.HelpDeskOfHousingOffice.models.entities.Request;

import java.util.List;

public interface RequestService {

    Request create(Request request);
    Request readById(long id);
    Request update(Request request);
    void delete(long id);
    List<Request> getAll();
}
